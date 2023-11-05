package gfgnotes.hashset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("kani");
        ts.add("dhinesh");
        ts.add("bru");
        ts.add("perf");

        System.out.println(ts); //[bru, dhinesh, kani, perf] results are sorted
    }
}
