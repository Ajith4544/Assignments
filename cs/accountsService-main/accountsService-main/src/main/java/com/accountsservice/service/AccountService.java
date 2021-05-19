package com.accountsservice.service;

import com.accountsservice.controller.request.TransferBalanceRequest;
import com.accountsservice.dto.AccountStatement;
import com.accountsservice.entity.Account;
import com.accountsservice.entity.Transaction;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    Transaction sendMoney(
            TransferBalanceRequest transferBalanceRequest
    );
    AccountStatement getStatement(String accountNumber);
}
