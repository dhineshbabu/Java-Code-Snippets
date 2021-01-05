package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWriteStringFromToFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("sample.txt");
        Files.writeString(path, "This is from java 11 practice");
        String content = Files.readString(path);
        System.out.println(content);
        Files.writeString(path, "\nThis is new string", StandardOpenOption.APPEND);
        String newContent = Files.readString(path);
        System.out.println(newContent);
    }
}
