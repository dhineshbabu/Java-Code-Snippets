package general_programming;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371, originalNumber, remainder, result=0;
        originalNumber = number;
        while(originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("This is not an armstrong number");
        }
    }
}
