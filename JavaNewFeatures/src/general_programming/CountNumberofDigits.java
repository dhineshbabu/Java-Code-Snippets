package general_programming;

public class CountNumberofDigits {
    public static void main(String[] args) {
        int count = 0, inputNumber = 45445454;
        while(inputNumber != 0) {
            inputNumber /= 10;
            ++count;
        }
        System.out.println("Total number of digits are : " + count);
    }
}
