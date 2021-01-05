package java9;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DiamondOperatorEnhancements {

    public static void main(String[] args) {
        // From java 9 we can use <> operator for anonymous inner classes
        String[] animals = {"Dog", "Cat", "Tiger", "Lion", "elephant"};
        Iterator<String> iter = new Iterator<>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < animals.length;
            }

            @Override
            public String next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                return animals[i++];
            }
        };

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
