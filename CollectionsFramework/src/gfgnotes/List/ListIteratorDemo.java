package gfgnotes.List;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(it.nextIndex());
            System.out.println(it.hasPrevious());
            System.out.println(it.previousIndex());

        }

        // set method
        List<Integer> list2 = Arrays.asList(10,20,30);
        ListIterator<Integer> it2 = list2.listIterator();
        while (it2.hasNext()) {
            int x = (Integer)it2.next();
            it2.set(x*2);
            System.out.println("doubling");
        }
        System.out.println(list2);
        System.out.println(Collections.max(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.ensureCapacity(20);

    }
}
