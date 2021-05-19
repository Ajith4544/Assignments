package com.accountsservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.bson.types.BSONTimestamp;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "account-service-demo1")
public class Account {

    @Id
    private ObjectId _id;

    private String accountNumber;
    private String ifscCode;
    private BigDecimal currentBalance;
    private String email;

    public Account(String accountNumber, String ifscCode, BigDecimal currentBalance, String email) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.currentBalance = currentBalance;
        this.email = email;
    }

    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

	
	
}
