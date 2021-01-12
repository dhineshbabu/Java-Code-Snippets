package general_programming;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountNumberofLinesInFIle {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("sample.txt");

            long count = Files.lines(file).count();
            System.out.println("Total lines: " + count);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
