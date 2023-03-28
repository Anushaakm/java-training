package com.anu.codes;

import java.util.Scanner;

public class Bank{
    private double balance;
    private String accountNumber;
    private String ownerName;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank account = new Bank();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        account.setBalance(balance);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        account.setAccountNumber(accountNumber);

        System.out.print("Enter owner name: ");
       
        String ownerName = scanner.next();
        account.setOwnerName(ownerName);

        System.out.println("balance: " + account.getBalance());
        System.out.println("accountNumber: " + account.getAccountNumber());
        System.out.println("ownerName: " + account.getOwnerName());

        scanner.close();
    }
}
