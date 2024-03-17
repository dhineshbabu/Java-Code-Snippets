package randomdemo;

import java.util.Collections;
import java.util.Random;
import java.util.TreeMap;

public class SimpleRandom {
    public static void main(String[] args) {
        Random random = new Random();
       /* for (int i = 0; i < 20; i++) {
            System.out.print(random.nextInt(1, 11)+ " ");
        }

        */

        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        map.put(2, map.getOrDefault(4, 0)+1);
        map.put(4, map.getOrDefault(4, 0)+1);
        map.put(3, map.getOrDefault(4, 0)+1);
        map.put(1, map.getOrDefault(4, 0)+1);

        System.out.println(map.firstEntry().getKey());
        System.out.println(map.floorKey(Integer.MIN_VALUE));
    }
}
