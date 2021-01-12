package general_programming;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") +"/JavaNewFeatures/src/general_programming/test.txt";
        Charset encoding = Charset.defaultCharset();
        List<String> lines = Files.readAllLines(Paths.get(path), encoding);
        System.out.println(lines);
    }
}
