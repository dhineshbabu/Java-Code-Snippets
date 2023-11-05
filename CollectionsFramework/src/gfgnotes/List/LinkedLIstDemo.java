package gfgnotes.List;

import java.util.LinkedList;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.forEach(x -> System.out.println("This is " + x));
        System.out.println(lList.element());
        System.out.println(lList.peek());
        System.out.println(lList.peekFirst());
        lList.add(40);
        System.out.println(lList);
    }
}
