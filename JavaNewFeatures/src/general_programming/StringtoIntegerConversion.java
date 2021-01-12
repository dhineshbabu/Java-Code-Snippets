package general_programming;

public class StringtoIntegerConversion {
    public static void main(String[] args) {
        String str1 = "23";
        String str2 = "4566";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(num1);
        System.out.println(num2);

        int num3 = Integer.valueOf(str1);
        int num4 = Integer.valueOf(str2);

        System.out.println(Integer.class.isInstance(num3));
        System.out.println(Integer.class.isInstance(num4));
    }
}
