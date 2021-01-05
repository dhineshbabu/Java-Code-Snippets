package java9;

interface Interf2 {
    public static void m1() {
        m3();
    }
    public static void m2() {
        m3();
    }

    private static void m3() {
        System.out.println("Printing some common static functionalities of m1 and m2");
    }
}


public class Interface_PrivateStaticMethods {
    public static void main(String[] args) {
        Interf2.m1();
        Interf2.m2();
    }
}
