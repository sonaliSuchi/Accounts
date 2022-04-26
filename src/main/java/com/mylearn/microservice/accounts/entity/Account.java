package com.mylearn.microservice.accounts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private BigInteger accountNumber;
    private String accountType;
    private String name;
    private BigDecimal accountBalance;
    private long userId;

}
