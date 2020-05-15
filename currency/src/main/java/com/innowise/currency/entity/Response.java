package com.innowise.currency.entity;

import org.springframework.stereotype.Component;

@Component
public abstract class Response {

    public void showCurrentCurrencies() {
        Currency currency = getCurrency();
        System.out.println("BYN=" + currency.getByn() +
                " RUB=" + currency.getRub() +
                " USD=" + currency.getUsd());
    }

    public Currency getRates() {
        return getCurrency();
    }

    protected abstract Currency getCurrency();

}
