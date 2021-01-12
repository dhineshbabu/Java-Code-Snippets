package general_programming;

public class StringtoBooleanConversion {
    public static void main(String[] args) {
        String str1 = "true";
        String str2 = "false";

        boolean b1 = Boolean.valueOf(str1);
        boolean b2 = Boolean.valueOf(str2);

        System.out.println(Boolean.class.isInstance(b1));
        System.out.println(Boolean.class.isInstance(b2));
    }
}
