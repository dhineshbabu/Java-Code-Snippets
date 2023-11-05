package gfgnotes.strings;

public class StringDemo {
    public static void main(String[] args) {
        String str = "kani";
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2, 4));

        // String constant pool
        String s1 = "string1";
        String s2 = "string1";
        System.out.println(s1==s2); // true
        String s3 = "str";
        System.out.println(s2.contains(s3));
    }
}
