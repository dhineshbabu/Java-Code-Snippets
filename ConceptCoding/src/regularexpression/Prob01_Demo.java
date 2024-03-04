package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob01_Demo {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String pattern = "fox";

        // create a pattern
        Pattern p = Pattern.compile(pattern);
        // Create a matcher object
        Matcher m = p.matcher(text);

        // check the existence
        if(m.find()) {
            System.out.println(m.group() + "found in the text");
        } else {
            System.out.println("Pattern not available in the text");
        }
    }
}
