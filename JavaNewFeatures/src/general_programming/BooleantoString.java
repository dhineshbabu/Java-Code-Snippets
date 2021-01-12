package general_programming;

public class BooleantoString {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);

        System.out.println(b1);
        System.out.println(b2);

        //Using Boolean.toString() method
        String svalue1 = Boolean.toString(b1);
        String svalue2 = Boolean.toString(b2);

        System.out.println(svalue1);
        System.out.println(svalue2);
    }
}

