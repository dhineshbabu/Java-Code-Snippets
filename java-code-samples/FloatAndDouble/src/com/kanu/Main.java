package com.kanu;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue); //1.4E-45
        System.out.println("Float Maximum Value = " + myMaxFloatValue); //3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue); //4.9E-324
        System.out.println("Double Maximum Value = " + myMaxDoubleValue); //1.7976931348623157E308

        int myIntValue = 5;
        float myFloatValue = 5; // it is the best practice to append 'f' for float values if it is a whole number
        double myDoubleValue = 5; // it is the best practice to append 'd' for double values if it is a whole number

        float castFloatValue = (float) 5.25; // Not recommended but the error will not come for not appending 'f'

        /* Best Practice */
        float goodFloatValue = 5f;
        double goodDoubleValue = 5d;

        System.out.println("My Int Value = " + myIntValue); //5
        System.out.println("My Float Value  = " + goodFloatValue); //5.0
        System.out.println("My Double Value = " + goodDoubleValue); //5.0

        int checkIntValue = 5/3;
        float checkFloatValue = 5f / 3f;
        double checkDoubleValue = 5d / 3d; // By default Java will assume 5.0 as double though 'd' is not mentioned
        System.out.println("Int Division = " + checkIntValue); //1
        System.out.println("Float Division = " + checkFloatValue); //1.6666666
        System.out.println("Double Division = " + checkDoubleValue); //1.6666666666666667

        //Challenge program
        double numberOfounds = 200d;
        double convetedKiloGrams = numberOfounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convetedKiloGrams);// 90.718474

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi); //3.1415927
        System.out.println(anotherNumber); //3000000.456789
    }
}
