package regularexpression.threaddumpparser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadDumpParser1 {

    private static final String THREAD_DUMP_PATTERN = "^\"(.*?)\" ([^ ]+) (.*?)$";
    private static final String STACK_TRACE_PATTERN = "^\\tat (.*?)\\(.*?\\)$";

    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            System.out.println("Usage: java ThreadDumpParser <thread_dump_file> <output_file>");
            return;
        }

        String fileName = "thread_dump.txt";
        String outputFile = "parsed_thread_dump1.txt";
        List<ThreadInfo> threads = parseThreadDump(fileName);
        writeThreadDetails(threads, outputFile);
    }

    private static List<ThreadInfo> parseThreadDump(String fileName) throws IOException {
        List<ThreadInfo> threads = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        ThreadInfo currentThread = null;
        while ((line = reader.readLine()) != null) {
            Matcher threadMatcher = Pattern.compile(THREAD_DUMP_PATTERN).matcher(line);
            if (threadMatcher.find()) {
                String name = threadMatcher.group(1);
                String state = threadMatcher.group(2);
                String details = threadMatcher.group(3);
                currentThread = new ThreadInfo(name, state, details);
                threads.add(currentThread);
            } else if (currentThread != null && line.trim().startsWith("at ")) {
                Matcher stackTraceMatcher = Pattern.compile(STACK_TRACE_PATTERN).matcher(line);
                if (stackTraceMatcher.find()) {
                    String stackTrace = stackTraceMatcher.group(1);
                    currentThread.addStackTrace(stackTrace);
                }
            }
        }

        reader.close();
        return threads;
    }

    private static void writeThreadDetails(List<ThreadInfo> threads, String outputFile) throws IOException {
        StringBuilder output = new StringBuilder();
        output.append("| Name | State | Details | Stack Trace |\n");
        output.append("---------------------------------------------\n");
        for (ThreadInfo thread : threads) {
            output.append(String.format("| %-20s | %-10s | %-40s | %-70s |\n",
                    thread.getName(), thread.getState(), thread.getDetails(), thread.getStackTrace()));
        }

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(output.toString());
        }
    }

    private static class ThreadInfo {
        private final String name;
        private final String state;
        private final String details;
        private final StringBuilder stackTrace;

        public ThreadInfo(String name, String state, String details) {
            this.name = name;
            this.state = state;
            this.details = details;
            this.stackTrace = new StringBuilder();
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }

        public String getDetails() {
            return details;
        }

        public String getStackTrace() {
            return stackTrace.toString();
        }

        public void addStackTrace(String stackTrace) {
            this.stackTrace.append("\t").append(stackTrace).append("\n");
        }
    }
}
