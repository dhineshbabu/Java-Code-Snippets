package general_programming;

import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);
        System.out.println(st);

        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};
        String st1 = String.valueOf(ch1);
        String st2 = new String(ch1);
        System.out.println(st1);
        System.out.println(st2);

        char[] fromString = st1.toCharArray();
        System.out.println(Arrays.toString(fromString));

    }
}
