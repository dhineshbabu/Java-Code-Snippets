package general_programming;

public class ReverseNumber {
    public static void main(String[] args) {
        int inputNumber = 1234;
        int reversed = 0;

        for(;inputNumber != 0; inputNumber /= 10) {
            int digit = inputNumber % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
