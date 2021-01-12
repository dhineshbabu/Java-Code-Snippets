package general_programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXEmailValidation {
    public static void main(String[] args) {
        String email = "sample@.com";
        //Regular expression to accept valid email id
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(email);
        //Verifying whether given email is valid
        if(matcher.matches()) {
            System.out.println("Given email id is valid");
        } else {
            System.out.println("Given email id is not valid");
        }
    }
}
