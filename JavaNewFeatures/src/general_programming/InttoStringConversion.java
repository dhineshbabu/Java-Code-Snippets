package general_programming;

public class InttoStringConversion {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 99;

        //Using valueOf() method

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        System.out.println(str1);
        System.out.println(str2);

        // Using Integer.toString(0 method

        String str3 = Integer.toString(num1);
        String str4 = Integer.toString(num2);

        System.out.println(str3);
        System.out.println(str4);

    }
}
