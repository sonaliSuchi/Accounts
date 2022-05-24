package com.mylearn.microservice.accounts.service;

import com.mylearn.microservice.accounts.entity.Account;
import com.mylearn.microservice.accounts.repository.AccountRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@Slf4j
public class AccountService {
    @Autowired
    private AccountRepo repository;

    public Account createAccount(Account account) {
        log.info("Account :: create Account services {}",account.getAccountType());
        return repository.save(account);
    }

    public Account findAccountByAccNum(BigInteger accNum) {
        repository.findAll(Pageable.ofSize(50));
        Page<Account> page=repository.findAll(PageRequest.of(2,32));
        return repository.findAccountByAccountNumber(accNum);
    }
}
