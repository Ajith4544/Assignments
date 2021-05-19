package com.farmermanagementdemo1.bankAccountsData;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RequestAccount {

    private String accountNumber;
    private String ifscCode;
    private BigDecimal currentBalance;
    private String email;
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

}
