package general_programming;

import java.util.*;

public class IntersectionofArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 7, 9, 2};
        int[] array2 = {1, 7, 3, 4, 5};

        Map<Integer, Boolean> sourceMap = new HashMap<>();
        Set<Integer> common = new TreeSet<>();
        for(int i=0; i<array1.length;i++) {
            sourceMap.put(array1[i], true);
        }
        for (int i = 0; i < array2.length; i++) {
            if(sourceMap.containsKey(array2[i])) {
                common.add(array2[i]);
            }
        }
        System.out.println(common);
    }
}
