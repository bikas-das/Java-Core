package com.pkg.exception;

public class InsufficientFundException extends Exception {

    private double balance;
    private double amountRequested;

    InsufficientFundException() {
        super("Insufficient funds for this transaction.");
    }

    public InsufficientFundException(String message) {
        super(message);
    }

    public InsufficientFundException(double balance, double amountRequested) {
        super(String.format("Transaction failed: Requested $%.2f but only $%.2f is available.", amountRequested, balance));
        this.balance = balance;
        this.amountRequested = amountRequested;
    }


    public double getBalance() {
        return balance;
    }

    public double getAmountRequested() {
        return amountRequested;
    }
}
