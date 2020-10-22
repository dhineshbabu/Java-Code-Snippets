package com.kanu;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        result = 20;
        result = result / 3;
        System.out.println("Division result = " + (double) result); // 6.0
        result += 10;
        System.out.println("New aresult value = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!!");
        }

        int topScore = 80;
        if (topScore >= 100) {

            System.out.println("You got high score!!");
        }

        //Logical AND operator
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        //Logical OR operator
        int thirdTopScore = 40;
        if((topScore > 100) || (thirdTopScore < 50)) {
            System.out.println("Your score is less than third top score and that is less than the top score as well ");
        }

        boolean isCar = true;
        if(isCar = false) {
            System.out.println("This should not run.."); // This will work since the isCar is also boolean
        }

        /* another boolean validation */
        if(!isCar) {
            System.out.println("yayy. We found a shorcut!!!"); //runs because of the above assignment in the if condition
        }

        boolean myCar = isCar ? true : false;
        if(myCar){
            System.out.println("Yes i have a car");
        } else {
            System.out.println("No this is not a car!!!!");
        }

        /* Operators Challenge */
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = "+ theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = "+ isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
