package com.accountsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accountsservice.entity.Account;
import com.accountsservice.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction,String> {
    List<Transaction> findByAccountNumberEquals(String accountNumber);
}
