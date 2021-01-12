package general_programming;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("First non repeatable character: " + firstNonRepeatableChar(input));
        System.out.println(firstNonRepeatableCharVer2("dddjjjhlll"));
    }

    public static Character firstNonRepeatableCharVer2(String input) {
        for(char i: input.toCharArray()) {
            if(input.indexOf(i) == input.lastIndexOf(i)) {
                return i;
            }
        }
        return null;
    }

    public static Character firstNonRepeatableChar(String input) {
        HashMap<Character, Integer> charHashTable = new HashMap<>();
        int i, length;
        Character c;
        length = input.length();
        for (i=0; i<length; i++) {
            c = input.charAt(i);

            if(charHashTable.containsKey(c)) {
                //increment the value for the key in hash table
                charHashTable.put(c, charHashTable.get(c)+1);
            } else {
                charHashTable.put(c, 1);
            }
        }

        for (i=0; i<length; i++) {
            c = input.charAt(i);
            if(charHashTable.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}
