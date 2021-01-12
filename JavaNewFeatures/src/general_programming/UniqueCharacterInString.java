package general_programming;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        String input = "Alivve"; // contains only unique characters
        boolean result = false;
        for(char ch: input.toCharArray()){
            if(input.indexOf(ch) == input.lastIndexOf(ch)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        if(result == true) {
            System.out.println("THis string has only unique characters");
        } else {
            System.out.println("Check the string again");
        }
    }
}
