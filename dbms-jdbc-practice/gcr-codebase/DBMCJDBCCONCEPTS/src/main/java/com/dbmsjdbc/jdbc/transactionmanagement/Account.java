package com.dbmsjdbc.jdbc.transactionmanagement;

import java.math.BigDecimal;

public class Account {

    private int accountId;
    private String accountHolder;
    private BigDecimal balance;

    public Account(int accountId, String accountHolder, BigDecimal balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountId() { 
    	return accountId; 
    	}
    public String getAccountHolder() { 
    	return accountHolder; 
    	}
    public BigDecimal getBalance() { 
    	return balance; 
    	}
    
    @Override
    public String toString() {
        return "Account [ID=" + accountId +", Holder=" + accountHolder +", Balance=" + balance + "]";
    }
}