package com.innowise.currency.entity;

public class Currency {

    private double usd;
    private double byn;
    private double rub;

    public Currency() {
    }

    public Currency(double usd, double byn, double rub) {
        this.usd = usd;
        this.byn = byn;
        this.rub = rub;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getByn() {
        return byn;
    }

    public void setByn(double byn) {
        this.byn = byn;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }
}
