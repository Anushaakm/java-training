package com.anu.codingQuestions.Bank;

import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        int choice;
        do {
            System.out.println("🔥 Bank Menu 🔥");
            System.out.println("-------------------");
            System.out.println("Select Your Choice");
            System.out.println("-------------------");
            System.out.println("1. Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("\n👉 Enter your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nYour Account Balance: " + balance + " Rs\n");
                    break;
                case 2:
                    System.out.print("\nEnter the Amount to Withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("❌ Insufficient Balance. Cannot Withdraw\n");
                    } else {
                        balance -= withdraw;
                        System.out.println("💰 " + withdraw + " Rs Withdrawn Successfully\n");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter the Amount to Deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("💰 " + deposit + " Rs Deposited Successfully\n");
                    break;
                case 4:
                    System.out.print("\nEnter the Amount to Transfer: ");
                    double transfer = scanner.nextDouble();
                    if (transfer > balance) {
                        System.out.println("❌ Insufficient Balance. Cannot Transfer\n");
                    } else {
                        balance -= transfer;
                        System.out.print("Enter the Account Number to Transfer: ");
                        String accountNumber = scanner.next();
                        System.out.println("💰 " + transfer + " Rs Transferred to Account " + accountNumber + " Successfully\n");
                    }
                    break;
                case 5:
                    System.out.println("\nThank you for using our Bank\n");
                    break;
                default:
                    System.out.println("\n❌ Invalid Choice. Please try again.\n");
                    break;
            }
        } while (choice != 5);
    }
}

