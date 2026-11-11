package com.pkg.exception_2;

public class NewInsufficientBalanceException extends RuntimeException {

    private double balance;
    private double amountRequested;

    public NewInsufficientBalanceException() {
        super("Insufficient funds for this transaction.");
    }

    public NewInsufficientBalanceException(String message) {
        super(message);
    }

    public NewInsufficientBalanceException(double balance, double amountRequested) {
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
