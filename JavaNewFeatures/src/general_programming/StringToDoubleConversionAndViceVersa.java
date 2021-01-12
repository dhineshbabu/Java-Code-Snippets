package general_programming;

import java.util.function.DoubleUnaryOperator;

public class StringToDoubleConversionAndViceVersa {
    public static void main(String[] args) {
        String str1 = "23";
        String str2 = "456.6";

        /* String to double conversion*/

        //Using Double.parseDouble()
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        System.out.println(num1);
        System.out.println(num2);

        //valueOf()

        double num3 = Double.valueOf(str1);
        double num4 = Double.valueOf(str2);

        System.out.println(num3);
        System.out.println(num4);

        /* double to String conversion*/

        String str = String.valueOf(num1);
        System.out.println(str);
        String str4 = Double.toString(num1);
        System.out.println(str4);

        //simple append with +

        String str5 = ""+num1;
        System.out.println(str5.getClass().getName());

        // Using String.format() function
        double num = 9.99;
        String str6 = String.format("%.2f", num4);
        System.out.println(str6);
    }
}
