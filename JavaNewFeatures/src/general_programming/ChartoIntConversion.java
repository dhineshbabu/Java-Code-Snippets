package general_programming;

public class ChartoIntConversion {
    public static void main(String[] args) {
        char a = '5';
        char b = '9';

        int num1 = Character.getNumericValue(a);
        int num2 = Character.getNumericValue(b);

        System.out.println(a);
        System.out.println(b);
    }
}
