package general_programming;

import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class IterateOverEnum {
    public static void main(String[] args) {
        // Using values() method
        for(Size size: Size.values()) {
            System.out.print(size+", ");
        }

        //using EnumSet class
        EnumSet<Size> enumSet = EnumSet.allOf(Size.class);
        for(Size constant: enumSet) {
            System.out.print(constant+" ,");
        }
    }
}
