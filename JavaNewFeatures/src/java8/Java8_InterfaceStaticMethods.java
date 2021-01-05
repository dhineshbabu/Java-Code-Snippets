package java8;

interface Interf4 {
    static void m1(int a, int b) {
        System.out.println("This is the value of sum: "+ (a+b));
    }
}


public class Java8_InterfaceStaticMethods {
    public static void main(String[] args) {
        Interf4.m1(10,20);
    }
}
