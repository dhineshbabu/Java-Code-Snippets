package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob03_PriceMatcher {
    public static void main(String[] args) {
        String text = "The price is $10.99";
        String pattern = "The price is \\$(\\d+\\.\\d+)";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.find()) {
            System.out.println("Value is : " + m.group(1));
        } else {
            System.out.println("Value not found in the given text");
        }
    }
}
