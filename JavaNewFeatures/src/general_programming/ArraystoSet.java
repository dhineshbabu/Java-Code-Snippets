package general_programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraystoSet {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));
        System.out.println(set);
    }
}
