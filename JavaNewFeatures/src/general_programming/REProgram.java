package general_programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REProgram {
    public static void main(String[] args) {
        Pattern p =  Pattern.compile("ab");
        Matcher m = p.matcher("abbabbba");
        while (m.find()) {
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
        }
    }
}
