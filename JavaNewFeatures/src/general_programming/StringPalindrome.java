package general_programming;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scan.nextLine();
        System.out.println("This string is : " + input + "- Palindrome? : " + isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {
        if(input == null || input.isEmpty()) {
            return true;
        }

        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());
        for(int i = input.length()-1; i>=0; i--) {
            sb.append(inputArray[i]);

        }
        String reversedString = sb.toString();
        return input.equals(reversedString);
    }
}
