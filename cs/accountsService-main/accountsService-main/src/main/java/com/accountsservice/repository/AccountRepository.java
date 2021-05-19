package com.accountsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accountsservice.entity.Account;

public interface AccountRepository extends MongoRepository<Account,Long> {
    Account findByAccountNumberEquals(String accountNumber);
}
