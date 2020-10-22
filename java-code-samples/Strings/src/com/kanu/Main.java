package com.kanu;

public class Main {

    public static void main(String[] args) {

        /* String is not a primitive type */
        /* Strings in java is immutable */

        String myString = "This is a string";
        System.out.println("Mystring is  = " + myString);
        myString = myString + " , and to add more to it.";
        System.out.println("New string after concatenation, "+ myString);
        myString = myString + " \u00A9 2019";
        System.out.println("Added symbol " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("Number String = "+ numberString); //250.5549.55
        String lastString = "10";

        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString); //1050

        double doubeNumber = 12.45d;
        lastString = lastString + doubeNumber;
        System.out.println("Last string is " + lastString); //"105012.45"

    }
}
