package org.performance.apacheweblogparser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApacheLogParser parser = new ApacheLogParser();
        parser.parseLogs("webserver_log.txt", "output_webserver_log.txt");

    }
}