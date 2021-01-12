package general_programming;

public class SwitchStatementonString {
    public static void main(String[] args) {
        String language = "Java";

        switch (language){
            case "Java":
                System.out.println("Java is selected");
                break;
            case "Javascript":
                System.out.println("JS is selected");
                break;
            case "python":
                System.out.println("Python is selected");
                break;
            default:
                System.out.println("No record found");
                break;
        }
    }
}
