package regularexpression.threaddumpparser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadDumpParser {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("thread_dump.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("parsed_thread_dump.txt"))) {

            String line;
            boolean inThreadSection = false;
            String threadName = "";
            String elapsedTime = "";
            String state = "";
            String tid = "";
            String waitingOn = "";

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("\"")) {
                    inThreadSection = true;
                    threadName = line.substring(1, line.indexOf('"', 1));
                    writer.write("Thread Name: " + threadName + "\n");
                } else if (inThreadSection && !line.trim().isEmpty()) {
                    if (line.contains("tid=")) {
                        Pattern pattern = Pattern.compile("tid=(\\d+)");
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.find()) {
                            tid = matcher.group(1);
                        }
                    } else if (line.contains("waiting on")) {
                        waitingOn = line.trim();
                    } else if (line.contains("elapsed time")) {
                        elapsedTime = line.trim();
                    } else if (line.contains("java.lang.Thread.State")) {
                        state = line.trim();
                    }
                } else {
                    inThreadSection = false;
                    writer.write("Elapsed Time: " + elapsedTime + "\n");
                    writer.write("State: " + state + "\n");
                    writer.write("TID: " + tid + "\n");
                    if (!waitingOn.isEmpty()) {
                        writer.write("Waiting On: " + waitingOn + "\n");
                    }
                    writer.write("\n");

                    // Reset variables for the next thread
                    threadName = "";
                    elapsedTime = "";
                    state = "";
                    tid = "";
                    waitingOn = "";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
