package java8;

interface Interf3 {
    default void m1() {
        System.out.println("This is from default method");
    }
}

public class Java8_InterfaceDefaultMethods implements Interf3 {
    public static void main(String[] args) {
        Java8_InterfaceDefaultMethods test = new Java8_InterfaceDefaultMethods();
        test.m1(); // No implementation is mandatory for default interface methods
    }
}
