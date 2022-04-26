package com.mylearn.microservice.accounts.repository;

import com.mylearn.microservice.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccountRepo extends JpaRepository<Account, BigInteger> {
    Account findAccountByAccountNumber(BigInteger accNum);
}
