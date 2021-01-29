package java12;

import java.util.List;

public class PatternMatchingForInstanceOf {
    public static void main(String[] args) {
        Object obj = List.of(1,2,3);
        if(obj instanceof List list){ // need to fix
            for(Object x: list){
                System.out.println(x);
            }
        }
    }
}
