package general_programming;

public class SumNumberswithRecursion {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("Sum is: " + addNumbers(number));

    }

    public static int addNumbers(int num) {
        if(num != 0) {
            return num + addNumbers(num-1);
        }
        else
            return num;
    }
}
