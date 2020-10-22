package com.kanu;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        //This must be the very first line if we call the constructor using this() .
        //We do constructor overloading here
        this("545124", 2.50, "Default Name", "Default addresss", "Default Phone");
        System.out.println("Empty Constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with paramaters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);

    }

    public void deposit(double depositAmout) {
        this.balance += depositAmout;
        System.out.println("Deposit of " + depositAmout + " made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawlAmount) {
        if(this.balance - withdrawlAmount < 0) {
            System.out.println("Only "+ this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawal of "+ withdrawlAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
