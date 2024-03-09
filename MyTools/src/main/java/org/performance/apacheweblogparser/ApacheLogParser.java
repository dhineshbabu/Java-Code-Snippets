package org.performance.apacheweblogparser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApacheLogParser {
    public void parseLogs(String inputFile, String outputFile) throws IOException {
        // Pattern to extract the URL in the log file , at each line
        String logEntryPattern = "\"(GET|POST) (.*?) HTTP/1.[01]\"";
        Pattern pattern = Pattern.compile(logEntryPattern);

        // Create an hashmap to store the URLs
        Map<String, Integer> urlCountMap = new HashMap<>();

        // Loop throgh the input file and process the regex
        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()) {
                    // then add the URL to the map
                    String method = matcher.group(1);
                    String url = matcher.group(2);
                    urlCountMap.put(method+"-"+url, urlCountMap.getOrDefault(method+"-"+url, 0)+1);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        // Write the URLs and their counts to the output file

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for(Map.Entry<String, Integer> entry: urlCountMap.entrySet()){
                bw.write(entry.getKey() + " and count " + entry.getValue());
                bw.newLine();
            }
            System.out.println("Parsing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
