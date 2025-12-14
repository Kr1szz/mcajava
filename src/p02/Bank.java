package p02;

import java.util.*;

class BankAccount {

    String name;
    int accountNumber;
    double balance;

    // Static variable to track total accounts
    static int totalAccounts = 0;

    // Default constructor
    BankAccount() {
        name = "Unknown";
        accountNumber = 0;
        balance = 0.0;
        totalAccounts++;
    }

    // Parameterized constructor
    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accountNumber = accNo;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method (method overloading)
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " amount deposited successfully.");
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " amount deposited (int).");
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " amount withdrawn successfully.");
        }
    }

    // Display account details
    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Static method to display total accounts created
    static void showTotalAccounts() {
        System.out.println("\nTotal accounts created: " + totalAccounts);
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating account using constructor
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Initial Balance Amount: ");
        double bal = sc.nextDouble();

        BankAccount obj = new BankAccount(name, acc, bal);

        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Show Total Accounts Created");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    obj.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    obj.withdraw(wd);
                    break;

                case 3:
                    System.out.println("Current Balance: " + obj.balance);
                    break;

                case 4:
                    obj.display();
                    break;

                case 5:
                    BankAccount.showTotalAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}