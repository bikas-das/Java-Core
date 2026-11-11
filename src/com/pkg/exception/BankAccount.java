package com.pkg.exception;

public class BankAccount {
    private double balance = 1000.00;

    private void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException(balance, amount);
        }
        balance -= amount;
        System.out.println("withdraw successful , new balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();

        try {
            bankaccount.withdraw(2000);
        } catch (InsufficientFundException e) {
            System.err.println((e.getMessage()));
            System.out.println("Shortage amount: $" + (e.getAmountRequested() - e.getBalance()));

        }
    }
}

