package gfgnotes.comparator;

import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {
        Point[] arr = {
                new Point(10, 20),
                new Point(5, 45),
                new Point(25, 35),
        };

        Arrays.sort(arr, (p1, p2) -> p1.x - p2.x);
        System.out.println(Arrays.toString(arr));
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "( "+x+" "+y+" )";
    }
}