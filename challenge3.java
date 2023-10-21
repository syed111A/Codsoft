package prac;

import java.util.Scanner;

class Bank_Account {
    private double currentBalance;

    public Bank_Account() {
        currentBalance = 0.0;
    }

    public Bank_Account(double startAmount) {
        currentBalance = startAmount;
    }

    public Bank_Account(String balanceStr) {
        currentBalance = Double.parseDouble(balanceStr);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void deposit(String amountStr) {
        double amount = Double.parseDouble(amountStr);
        deposit(amount);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void withdraw(String amountStr) {
        double amount = Double.parseDouble(amountStr);
        withdraw(amount);
    }

    public void setBalance(double newBalance) {
        currentBalance = newBalance;
    }

    public void setBalance(String balanceStr) {
        currentBalance = Double.parseDouble(balanceStr);
    }

    public double getBalance() {
        return currentBalance;
    }
}

class ATM {
    private Bank_Account userAccount;
    private Scanner scanner;

    public ATM(Bank_Account account) {
        userAccount = account;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void Menu() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
 public class challenge3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Bank_Account myAccount = new Bank_Account(initialBalance);

        ATM atm = new ATM(myAccount);
        atm.Menu();

        
    }
}