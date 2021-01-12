package general_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesinArrayListWithStreams {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,3,4,4,5,5));
        System.out.println("Old Array List: " + al);

        List<Integer> newList = al.stream().distinct().collect(Collectors.toList());
        System.out.println("New list after duplicates removal: " + newList);
    }
}
