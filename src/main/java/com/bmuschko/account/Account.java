package com.bmuschko.account;

import java.math.BigDecimal;

public class Account {

    private final Long id;
    private final String owner;
    private final BigDecimal balance;

    public Account(Long id, String owner, BigDecimal balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
