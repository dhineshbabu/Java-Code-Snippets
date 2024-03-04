package regularexpression.threaddumpparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadDump1LinerRegex {

    public static void main(String[] args) {
        String line = "\"Reference Handler\" #2 daemon prio=10 os_prio=31 cpu=3.24ms elapsed=43.84s tid=0x0000000140009c00 nid=0x4b03 waiting on condition  [0x000000016ea5a000]";

        // Define the regex pattern to extract information
        //String regex = "\"([^\"]*)\" #(\\d+) (\\w+) prio=(\\d+) os_prio=(\\d+) cpu=([\\d.]+\\w+) elapsed=([\\d.]+\\w+) tid=(0x[0-9a-f]+) nid=(0x[0-9a-f]+) (\\w+ \\w+ \\w+ \\w+)";
//        String regex = "\"([^\"]*)\" #(\\d+) (\\w+) prio=(\\d+) os_prio=(\\d+) cpu=([\\d.]+\\w+) elapsed=([\\d.]+\\w+) tid=(0x[0-9a-f]+) nid=(0x[0-9a-f]+) (\\w+ \\w+ \\w+ \\w+).*";
        String regex = "\"([^\"]*)\" #(\\d+) (\\w+) prio=(\\d+) os_prio=(\\d+) cpu=([\\d.]+\\w+).*elapsed=([\\d.]+\\w+).*tid=(0x[0-9a-f]+).*nid=(0x[0-9a-f]+) (.*)";


        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(line);

        // Find and print each group of information
        if (matcher.find()) {
            System.out.println("Thread Name: " + matcher.group(1));
            System.out.println("Thread Number: " + matcher.group(2));
            System.out.println("Thread Type: " + matcher.group(3));
            System.out.println("Priority: " + matcher.group(4));
            System.out.println("OS Priority: " + matcher.group(5));
            System.out.println("CPU Time: " + matcher.group(6));
            System.out.println("Elapsed Time: " + matcher.group(7));
            System.out.println("Thread ID: " + matcher.group(8));
            System.out.println("Thread Native ID: " + matcher.group(9));
            System.out.println("State: " + matcher.group(10));
        }
    }
}
