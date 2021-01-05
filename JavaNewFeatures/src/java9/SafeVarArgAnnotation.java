package java9;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgAnnotation {

    /*
    Very few Var-arg Methods cause Heap Pollution, not all the var-arg methods. If we know that our
    method won't cause Heap Pollution, then we can suppress compiler warnings with @SafeVarargs
    annotation
     */
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("Dhinesh", "Babu");
        List<String> l2= Arrays.asList("Kanu", "Hasini");
        m1(l1,l2);
    }

    @SafeVarargs
    public static void m1(List<String>... l) {
        for(List<String> l1: l) {
            System.out.println(l1);
        }
    }
}
