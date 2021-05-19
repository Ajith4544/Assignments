package com.accountsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor

@NoArgsConstructor
public class Transactions {

	
	private List<Transaction> transactionList;

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public Transactions(List<Transaction> transactionList) {
		super();
		this.transactionList = transactionList;
	}
	public Transactions() {}
	
}
