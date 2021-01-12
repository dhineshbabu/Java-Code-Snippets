package general_programming;

import java.io.*;

public class ReadingFromFile2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File(System.getProperty("user.dir") +"/JavaNewFeatures/src/general_programming/test.txt"));
        BufferedReader br = new BufferedReader(fr);
        String sample = br.readLine();
        System.out.println(sample);

    }
}
