package general_programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REProgram2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\.");
        String[] s = p.split("www.dhinesh.com");
        for(String s1: s) {
            System.out.println("Value is "+ s1 );
        }

    }
}
