package com.kanu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lattuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        //price = hamburger.itemizeHamburger();
        System.out.println("Total Burger Price is : " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Should not do this ", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}
