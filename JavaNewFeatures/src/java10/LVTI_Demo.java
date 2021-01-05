package java10;

import java.util.ArrayList;

public class LVTI_Demo {
    public static void main(String[] args) {
        var i = 10; // Type inference
        System.out.println(i);
        var name = "dhinesh";
        System.out.println(name);

        //type inference in loops
        for(var j=0; j< 10; j++) {
            System.out.println(j);
        }

        //For arrays
        var x = new int[] {1,2,3,4,5};
        for(var y: x) {
            System.out.println(y);
        }

        //For collections
        var al = new ArrayList<String>();
        al.add("Dhinesh");
        al.add("Kanu");
        System.out.println(al);

        // var can be used as an identifier
        var var = 10;
        System.out.println(var);
    }
}
