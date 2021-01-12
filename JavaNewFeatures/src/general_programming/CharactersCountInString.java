package general_programming;

import java.util.HashMap;

public class CharactersCountInString {
    public static void main(String[] args) {
        String input = "Alive is awesome";

        HashMap<Character, Integer> counterMap = new HashMap<>();
        char[] ch = input.toCharArray();

        for(char ch1: ch) {
            if(counterMap.containsKey(ch1)) {
                counterMap.put(ch1, counterMap.get(ch1)+1);
            } else {
                counterMap.put(ch1, 1);
            }
        }

        //displaying the results
        System.out.println(counterMap);
    }
}

