package general_programming;

import java.util.ArrayList;

@FunctionalInterface
interface ABC{
    void show2();
}

class A {
    public void show() {
        System.out.println("in general_programming.A");
    }
}

class B extends A {
    @Deprecated
    public void showDeprecated() {

    }

    @Override
    @SuppressWarnings("unchecked")
    public void show() {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("in general_programming.B");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
