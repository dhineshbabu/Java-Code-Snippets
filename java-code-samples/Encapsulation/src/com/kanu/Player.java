package com.kanu;

public class Player {
    public String fullName;
    public  int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("player Knocked out");

        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
