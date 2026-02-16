package com.dbmsjdbc.jdbc.transactionmanagement;

import java.math.BigDecimal;
import java.sql.Connection;

public class BankService {

    private AccountDAO dao = new AccountDAO();

    public void transferMoney(int fromId, int toId, BigDecimal amount) {

        if (fromId == toId) {
            System.out.println("Cannot transfer to same account.");
            return;
        }

        Connection conn = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);   // START TRANSACTION

            BigDecimal fromBalance = dao.getBalance(fromId, conn);

            if (fromBalance.compareTo(amount) < 0) {
                throw new RuntimeException("Insufficient balance");
            }

            BigDecimal toBalance = dao.getBalance(toId, conn);

            dao.updateBalance(fromId, fromBalance.subtract(amount), conn);
            dao.updateBalance(toId, toBalance.add(amount), conn);

            dao.insertTransaction(fromId, toId, amount, conn);

            conn.commit();   // COMMIT
            System.out.println("Transfer successful.");

        } catch (Exception e) {

            try {
                if (conn != null) conn.rollback();  // ROLLBACK
            } catch (Exception ignored) {}

            System.out.println("Transaction failed: " + e.getMessage());

        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception ignored) {}
        }
    }

    public void checkBalance(int accountId) {

        try (Connection conn = DBConnection.getConnection()) {

            BigDecimal balance = dao.getBalance(accountId, conn);
            System.out.println("Current Balance: " + balance);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showTransactionHistory(int accountId) {

        try (Connection conn = DBConnection.getConnection()) {
            dao.showTransactions(accountId, conn);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}