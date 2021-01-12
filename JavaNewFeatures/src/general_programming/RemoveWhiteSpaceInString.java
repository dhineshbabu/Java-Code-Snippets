package general_programming;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String input = "   manchester united is also known as red devil   ";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch != ' ') {
                System.out.print(ch);
            }
        }
    }
}
