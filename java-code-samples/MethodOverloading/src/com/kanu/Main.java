package com.kanu;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Kanu", 500);
        System.out.println("New Score is "+ newScore);
        calculateScore(75);
        calculateScore();


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + "Score: " + score );
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Anonymous Player:Scored: " + score );
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No player name and No player score is available");
        return 0;
    }



}
