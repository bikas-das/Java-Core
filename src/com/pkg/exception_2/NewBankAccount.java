package com.pkg.exception_2;

public class NewBankAccount {

    private double balance = 1000.00;

    private void withdraw(double amount) {
        if (amount > balance) {
            throw new NewInsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("withdraw successful , new balance: " + balance);
    }


    public static void main(String[] args) {
        NewBankAccount newBankAccount = new NewBankAccount();

        try {
            newBankAccount.withdraw(1500.00);
        } catch (NewInsufficientBalanceException e) {
            System.err.println(e.getMessage());
            System.out.println("Shortage amount: $" + (e.getAmountRequested() - e.getBalance()));

        }

    }
}
