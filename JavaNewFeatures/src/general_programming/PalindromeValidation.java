package general_programming;

public class PalindromeValidation {
    public static void main(String[] args) {
        int inputNumber = 1221;
        int reversed = 0;

        for(int original = inputNumber;original != 0; original /= 10) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
        }
        if(inputNumber == reversed) {
            System.out.println("This number is palindrome");
        } else  {
            System.out.println("This is not palindrome");
        }
    }
}
