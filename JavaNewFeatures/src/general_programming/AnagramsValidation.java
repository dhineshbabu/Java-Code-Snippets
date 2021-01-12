package general_programming;

import java.util.Arrays;

public class AnagramsValidation {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "vaaj";

        if(str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);

            if(result) {
                System.out.println("These strings are anagrams");
            } else {
                System.out.println("These strings are not anagrams");
            }
        }
        else {
            System.out.println("These strings are not anagrams");
        }
    }
}
