package com.kanu;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted Max Value = "+ (myMaxIntValue + 1)); //-2147483648 -> overflow
        System.out.println("Busted Min Value = "+ (myMinIntValue - 1)); //2147483647 -> underflow

        int validRepresentation = 2_147_783;
        System.out.println("Int can be represented as "+ validRepresentation); //2147783

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ minByteValue); // -128
        System.out.println("Byte Maximum Value = "+ maxByteValue); // 127

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+ minShortValue); //-32768
        System.out.println("Short Maximum Value = " + maxShortValue); //32767

        long myLongValue = 100L; // L must be appended with long number
        long minLongvalue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = "+ minLongvalue); //-9223372036854775808
        System.out.println("Maximum Long Value = "+ maxLongValue); //9223372036854775807

        /* Byte occupies 8 bits of memory */
        /* Short occupies 16 bits of memory */
        /* int occupies 32 bits of memory */
        /* long occupies 64 bits of memory */

        int myIntTotal = (myMinIntValue / 2);
        System.out.println("My Int Total = "+ myIntTotal); //-1073741824

        /* Type Casting */
        byte myNewByteValue = (byte) (minByteValue / 2); // Integer will be assumed by java for expression
        short myNewShortValue = (short) (minShortValue / 2);



    }
}
