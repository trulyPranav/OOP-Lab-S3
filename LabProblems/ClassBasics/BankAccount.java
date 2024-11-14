package LabProblems.ClassBasics;

// Design a class to represent a bank account.
// Include the following members:
// Data members:
// Name of the depositor
// Account number
// Type of account
// Balance amount in the account.

// Methods:
// To assign initial values
// To deposit an amount
// To withdraw an amount after checking balance
// To display the name and balance

import java.util.Scanner;

class BankAccount {
    String name;
    int accNo;
    String accType;
    double balance;

    void createAccount(String name, int accNo, String accType, double balance){
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
        System.out.println("Account Successfully Created!");
        System.out.println();
    }
    void depositAmount(double amount){
        balance += amount;
        System.out.println("Amount " + amount + " Deposited Successfully!");
    }
    void withdraw(double amount){
        if(amount > balance)
            System.out.println("Current Balance is: " + balance + "\nTherefore Insufficient amount to Withdraw");
        else {
            balance -= amount;
            System.out.println("Amount " + amount + " Withdrawn Successfully!" + "\nCurrent Balance is: " + balance);
        }
    }
    void displayAccountDetails(){
        System.out.println("Name of Account Holder is: " + name);
        System.out.println("Balance Amount in Account: " + balance);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        BankAccount account = new BankAccount();
        boolean check = true;
        while(check){
            System.out.println("Welcome to Ajoy Bank!");
            System.out.println("Ajoy Bank offers the following services: ");
            System.out.println("1) Create an Account\n2) Deposit an Amount\n3) Withdraw an Amount\n4) Display Details of an Account\n5) EXIT AJOY BANK");
            System.out.print("What do you need: ");
            int choose = src.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = src.next();
                    System.out.print("Enter your account number: ");
                    int accNo = src.nextInt();
                    System.out.print("Enter your account type: ");
                    String accType = src.next();
                    System.out.print("Enter your intial deposit amount: ");
                    double balance = src.nextInt();
                    account.createAccount(name,accNo,accType,balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double amount = src.nextDouble();
                    account.depositAmount(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = src.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank You for Choosing AJOY BANK!");
                    check = false;
                    break;
                default:
                    System.out.println("Enter a Valid Ajoy Bank Service!");
                    break;
            }
        }
        src.close();
    }
}
