package com.kanu;

import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer myValue = 56;
        int myInt = myValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0; dbl < 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + "  -->  " + value);
        }

    }
}
