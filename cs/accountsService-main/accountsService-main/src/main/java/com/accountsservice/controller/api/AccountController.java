package com.accountsservice.controller.api;

import com.accountsservice.controller.request.AccountStatementRequest;
import com.accountsservice.controller.request.TransferBalanceRequest;
import com.accountsservice.dto.AccountStatement;
import com.accountsservice.entity.Account;
import com.accountsservice.entity.Transaction;
import com.accountsservice.service.AccountService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping("/api/account")
@AllArgsConstructor
public class AccountController {
@Autowired
    private  AccountService accountService;
    @PostMapping("/create")
    public Account create(@RequestBody Account account) {
        return accountService.save(account);
    }

    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }

    @PostMapping("/sendMoney")
    public Transaction sendMoney(
            @RequestBody TransferBalanceRequest transferBalanceRequest) {
        return accountService.sendMoney(transferBalanceRequest);
    }


    @GetMapping("/statement")
    public AccountStatement getStatement(
            @RequestBody AccountStatementRequest accountStatementRequest){
        return accountService.getStatement(accountStatementRequest.getAccountNumber());
    }

    @GetMapping("/statement/{acc_no}")
    public AccountStatement getStatementDemo1(@PathVariable("acc_no") String acc_no){
        return accountService.getStatement(acc_no);
    }

}