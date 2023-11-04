package gfgnotes.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {
    public static void main(String[] args) {
        List<Integer > list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(13);
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
