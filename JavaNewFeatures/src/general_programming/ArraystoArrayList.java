package general_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraystoArrayList {
    public static void main(String[] args) {
        // Al to array
        List<String> list1 = new ArrayList<>();
        list1.add("Dhinesh");
        list1.add("Babu");

        String[] arr = new String[list1.size()];
        list1.toArray(arr);
        System.out.println(Arrays.toString(arr));

        //Array to al
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array list "+ al);
    }
}
