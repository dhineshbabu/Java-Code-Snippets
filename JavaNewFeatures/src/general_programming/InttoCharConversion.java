package general_programming;

public class InttoCharConversion {

    public static void main(String[] args) {
        // Using type casting
        int num1 = 80;
        int num2 = 81;

        char a = (char) num1;
        char b = (char) num2;
        System.out.println(a);
        System.out.println(b);

        //Using forDigit() method
        num1 = 1;
        num2 = 13;
        char c = Character.forDigit(num1, 10);
        char d = Character.forDigit(num2, 16);
        System.out.println(c);
        System.out.println(d);
    }
}
