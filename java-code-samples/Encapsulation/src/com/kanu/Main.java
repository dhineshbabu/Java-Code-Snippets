package com.kanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Bad Code */
        /*
        Player player = new Player();
        player.name = "Kanu";
        player.health = 20;
        player.weapon = "M416";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());
        */

        /* Good Code */

        EnhancedPlayer player = new EnhancedPlayer("Kanu", 50, "AKM");
        System.out.println("Initial health is " + player.getHealth());


    }
}
