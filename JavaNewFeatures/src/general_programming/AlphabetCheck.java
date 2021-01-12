package general_programming;

public class AlphabetCheck {
    public static void main(String[] args) {
        char c = 'A';

        String output = (c>='a' && c<='z') || (c>='A' && c<='Z') ? "Alphabet" : "Not an alphbet";
        System.out.println(output);
    }
}
