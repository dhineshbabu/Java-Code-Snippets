package java9;

interface interf1 {
    default void m1() {
        m3();
    }
    default void m2() {
        m3();
    }

    private void m3() {
        System.out.println("Printing some common functionalities of m1 and m2");
    }
}

public class Interface_PrivateMethods implements interf1{
    public static void main(String[] args) {
        Interface_PrivateMethods if1 = new Interface_PrivateMethods();
        if1.m1();
        if1.m2();
    }
}
