package com.kanu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(" My Int Value = " + myIntValue);
        System.out.println(" Another Int Value = " + anotherIntValue);

        anotherIntValue++;

        System.out.println(" My Int Value = " + myIntValue);
        System.out.println(" Another Int Value = " + anotherIntValue);

        //Reference Types

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //holds the same address of myIntArray

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another Array " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another Array " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8}; //de-referencing to another memory area

        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another Array " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; //de-referencing to another memory address (array)
    }
}
