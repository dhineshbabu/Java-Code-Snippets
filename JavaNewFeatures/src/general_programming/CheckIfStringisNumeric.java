package general_programming;

public class CheckIfStringisNumeric {
    public static void main(String[] args) {
        String input = "12.45mj41";
        try {
            Double num = Double.parseDouble(input);
            System.out.println("This is valid number");
        } catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }
    }
}
