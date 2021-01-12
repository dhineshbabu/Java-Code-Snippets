package general_programming;

public class SortingStringArray {
    public static void main(String[] args) {
        String[] words = { "Ruby", "C", "Python", "Java" };
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].compareTo(words[j]) > 0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Sorted words: " );
        for (String word: words ) {
            System.out.print(word);
        }
    }
}
