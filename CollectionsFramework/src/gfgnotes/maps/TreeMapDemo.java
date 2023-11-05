package gfgnotes.maps;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(100, "GFG");
        m.put(200, "Course");
        m.put(150, "IDE");

        System.out.println(m); //{100=GFG, 150=IDE, 200=Course}

    }
}
