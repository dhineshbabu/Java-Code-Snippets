package java8;

interface Interf5 {
    public void m2(int i);
}

public class Java8_DoubleColon_MethodRef {
    public static void  m1() {
        System.out.println("Printing from child thread");
    }

    public void sampleMethod(int i) {
        System.out.println("Referring the non static methods");
    }

    public static void main(String[] args) {
        Runnable r = Java8_DoubleColon_MethodRef::m1; // Referring static method
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main thread");
        }

        Java8_DoubleColon_MethodRef nonStatic = new Java8_DoubleColon_MethodRef();

        Interf5 i = nonStatic::sampleMethod;
        i.m2(10);
    }
}
