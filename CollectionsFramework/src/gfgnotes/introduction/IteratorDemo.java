package gfgnotes.introduction;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void removeEven(Collection<Integer> c) {
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()) {
            int x = (Integer) it.next();
            if(x % 2 == 0) {
                it.remove();
            }
        }
     }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        c.add(25);
        removeEven(c);
        System.out.println(c);
    }
}
