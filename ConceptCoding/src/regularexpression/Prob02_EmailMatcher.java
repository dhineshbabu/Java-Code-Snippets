package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob02_EmailMatcher {
    public static void main(String[] args) {
        String text = "Email me at example.test@email.com";
        String pattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.find()) {
            System.out.println("Email ID found and the value is : " + m.group());
        } else {
            System.out.println("EMail ID not found in the given text");
        }
    }
}
