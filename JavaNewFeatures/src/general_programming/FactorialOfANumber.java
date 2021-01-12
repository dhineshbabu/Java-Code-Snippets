package general_programming;

import java.math.BigInteger;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is " + factorial);
    }
}
