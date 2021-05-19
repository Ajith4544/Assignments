package com.accountsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

import com.accountsservice.entity.Transaction;
import com.accountsservice.entity.Transactions;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountStatement {
   

	BigDecimal currentBalance;

    Transactions transactionHistory;

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Transactions getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(Transactions transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	public AccountStatement(BigDecimal currentBalance, Transactions transactionHistory) {
		super();
		this.currentBalance = currentBalance;
		this.transactionHistory = transactionHistory;
	}
	public AccountStatement() {}
	
}