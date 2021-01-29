package java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMismatchMethod {
    public static void main(String[] args) throws IOException {
        //compares2 file contents and will return -1L when bot the files content is matched
        // if the content is not matched, then it will return the location value where mismatch is identified
        Path file1 = Paths.get("sample.txt");
        Path file2 = Paths.get("sample1.txt");
        Path file3 = Paths.get("newName.txt");

        System.out.println(Files.mismatch(file1,file2));
        System.out.println(Files.mismatch(file1,file3));
    }
}
