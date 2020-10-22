package com.kanu;

public class Main {

    public static void main(String[] args) {

       // Account kanuAccount = new Account("123456", 0.00, "Kanu Hasini", "kanu@gmail.com", "+9521545521");
        Account kanuAccount = new Account();
        kanuAccount.withdrawl(100);

        kanuAccount.deposit(50);
        kanuAccount.withdrawl(100);

        kanuAccount.deposit(51.0);;
        kanuAccount.withdrawl(100.0);

        Account dhineshAccount = new Account("Dhinesh", "dhinesh@gmail.com", "12456");
        System.out.println(dhineshAccount.getNumber() + " name " + dhineshAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bru", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Dhinesh", 500.00, "dhinesh@gmail.com");
        System.out.println(person3.getEmailAddress());

    }
}
