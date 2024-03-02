package gfgnotes.strings;

public class Prob_CheckingAnagram {
    static final int CHAR = 256;

    public static boolean areAnagram(String s1, String s2) {
        // Checking base case
        if(s1.length() != s2.length()) return false;

        int[] count = new int[CHAR];

        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0; i<CHAR; i++){
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "perf";
        String s2 = "erfp";

        System.out.println(areAnagram(s1, s2));
    }
}
