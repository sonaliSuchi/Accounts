package com.mylearn.microservice.accounts.controller;

import com.mylearn.microservice.accounts.entity.Account;
import com.mylearn.microservice.accounts.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/")
    public Account createAccount(@RequestBody Account account)
    {
        log.info("Account :: create Account");
        return accountService.createAccount(account);
    }

        @GetMapping("/{accNum}")
    public Account getAccount(@PathVariable BigInteger accNum)
    {
        log.info("Account :: getAccount  request for {}",accNum);
        return accountService.findAccountByAccNum(accNum);
    }

}
