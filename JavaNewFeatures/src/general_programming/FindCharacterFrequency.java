package general_programming;

public class FindCharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello this is sample sstring";
        char ch = 'i';
        int frequency = 0;

        for (int i=0; i<str.length(); i++) {
            if(ch == str.charAt(i)) {
                frequency++;
            }
        }
        System.out.println("Frequency of the character is : " + frequency);
    }
}
