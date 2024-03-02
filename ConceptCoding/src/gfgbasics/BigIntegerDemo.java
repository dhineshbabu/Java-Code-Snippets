package gfgbasics;

import java.math.BigInteger;

public class BigIntegerDemo {

    public static BigInteger factorialn(int a){
        BigInteger f = new BigInteger("1");

        for(int i=2; i<=a; i++) {
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;
    }

    public static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);

        for(int i = 2; i<=n; i++){
            c = a.add(b);
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        /*
        Used to store a large value
         */

        BigInteger A = new BigInteger("12467");
        BigInteger B = new BigInteger("100");
        BigInteger C  =A.add(B);
        System.out.println(C);
        System.out.println(factorialn(100));
        System.out.println(fibonacci(100));
        System.out.println(A.nextProbablePrime());
    }
}
