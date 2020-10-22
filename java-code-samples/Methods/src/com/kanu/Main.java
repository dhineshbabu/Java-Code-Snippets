package com.kanu;

public class Main {

    public static void main(String[] args) {

        int highScore1 = calculateScore(true, 800, 5, 100);
        int highScore2 = calculateScore(true, 1000, 8, 200);
        int highScore3 = calculateScore(false, 1000, 8, 200);
        System.out.println(highScore1);
        System.out.println(highScore2);
        System.out.println(highScore3);

        int highScorePosition = calculateHighScorePoistion(2000);
        displayHighScorePosition("Kanu", highScorePosition);

        highScorePosition = calculateHighScorePoistion(800);
        displayHighScorePosition("Dhinesh", highScorePosition);

        highScorePosition = calculateHighScorePoistion(1000);
        displayHighScorePosition("Bru", highScorePosition);



    }

    public  static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore  = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");

    }

    public  static  int calculateHighScorePoistion(int playerScore){
//        if(playerScore >= 1000) {
////            return 1;
////        } else if (playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100){
////            return  3;
////        }
////            return 4;

        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;

    }

}
