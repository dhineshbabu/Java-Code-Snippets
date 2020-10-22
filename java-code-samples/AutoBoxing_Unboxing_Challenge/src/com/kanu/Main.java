package com.kanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Indian National Bank");

        bank.addBranch("Chennai");
        bank.addCustomer("Chennai", "Tim", 50.05);
        bank.addCustomer("Chennai", "Dhinesh", 175.34);
        bank.addCustomer("Chennai", "Kanu", 50.35);

        bank.addBranch("Coimbatore");
        bank.addCustomer("Coimbatore", "Bru", 150.14);

        bank.addCustomerTransaction("Chennai", "Dhinesh", 44.22);
        bank.addCustomerTransaction("Chennai", "Dhinesh", 4.54);
        bank.addCustomerTransaction("Chennai", "Dhinesh", 19.51);

        bank.listCustomers("Chennai", true);
        bank.listCustomers("Coimbatore", true);

        if(!bank.addCustomer("Salem", "Muthu", 5.53)){
            System.out.println("Branch is not available in Salem. Please check the branch name again...");
        }

        if(!bank.addBranch("Chennai")){
            System.out.println("Branch in Chennai already exists. Can not add more branches..");
        }

        if(!bank.addCustomer("Chennai", "Dhinesh", 12.25)){
            System.out.println("Customer Dhinesh Already Exists");
        }
    }
}
