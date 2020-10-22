package com.kanu;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // Occupies 2 bytes of memory. For storing the character as Unicode format
        char myUnicode = '\u0044';
        System.out.println("My Char = "+ myChar); //D
        System.out.println("From Unicode = " + myUnicode); //D
        char myCopyRightChar = '\u00A9';
        System.out.println("Copyright Char = " + myCopyRightChar); // ©

        boolean myTrueBooelan = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOverTwentyOne = true;



    }
}
