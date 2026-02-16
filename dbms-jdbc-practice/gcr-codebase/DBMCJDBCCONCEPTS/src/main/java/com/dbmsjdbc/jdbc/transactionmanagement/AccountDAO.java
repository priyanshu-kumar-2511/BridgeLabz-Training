package com.dbmsjdbc.jdbc.transactionmanagement;

import java.math.BigDecimal;
import java.sql.*;

public class AccountDAO {

    public BigDecimal getBalance(int accountId, Connection conn) throws SQLException {

        String sql = "SELECT balance FROM accounts WHERE account_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getBigDecimal("balance");
            } else {
                throw new SQLException("Account not found");
            }
        }
    }

    public void updateBalance(int accountId, BigDecimal newBalance, Connection conn) throws SQLException {

        String sql = "UPDATE accounts SET balance = ? WHERE account_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setBigDecimal(1, newBalance);
            ps.setInt(2, accountId);

            int rows = ps.executeUpdate();

            if (rows != 1) {
                throw new SQLException("Update failed. Rows affected: " + rows);
            }
        }
    }

    public void insertTransaction(int from, int to, BigDecimal amount, Connection conn) throws SQLException {

        String sql = "INSERT INTO transactions (from_account, to_account, amount) VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, from);
            ps.setInt(2, to);
            ps.setBigDecimal(3, amount);

            ps.executeUpdate();
        }
    }

    public void showTransactions(int accountId, Connection conn) throws SQLException {

        String sql = "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ps.setInt(2, accountId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    "TxnID: " + rs.getInt("transaction_id") +
                    " | From: " + rs.getInt("from_account") +
                    " | To: " + rs.getInt("to_account") +
                    " | Amount: " + rs.getBigDecimal("amount") +
                    " | Time: " + rs.getTimestamp("transaction_time")
                );
            }
        }
    }
}