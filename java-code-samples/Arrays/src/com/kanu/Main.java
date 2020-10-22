package com.kanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = new int[10];
        myArray[5] = 50;
        System.out.println(myArray[0]);

        int[] myArrayAnotherForm = {1,2,3,4,5,6,7,8,9};
        System.out.println(myArrayAnotherForm.length);
        //System.out.println(myArrayAnotherForm[11]);//java.lang.ArrayIndexOutOfBoundsException:

       /*
       for(int i=0; i< myArrayAnotherForm.length; i++) {
            System.out.println("Element at position " + i + " is " + myArrayAnotherForm[i] );
        }
        */

        printArray(myArrayAnotherForm);

    }

    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++) {
            System.out.println("Element at position " + i + " is " + array[i] );
        }
    }
}
