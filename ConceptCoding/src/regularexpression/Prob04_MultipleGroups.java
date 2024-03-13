package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob04_MultipleGroups {
    public static void main(String[] args) {
        String stringToSearch = "Fourd score and seven years ago our fathers ...";

//        Pattern p = Pattern.compile("(\\S+or\\S+).* (\\S+the\\S+)");
        Pattern p = Pattern.compile("(\\b[A-Za-z]{5}\\b).* (\\S+ther\\S+)");
        Matcher m = p.matcher(stringToSearch);

        if(m.find()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }

    }
}
