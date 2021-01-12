package general_programming;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("deletefile.txt");
            boolean status = file.delete();
            if(status) {
                System.out.println("File deleted");
            } else
            {
                System.out.println("File does not exist");
            }

            //another method
            Path path = Paths.get("deletefile.txt");
            boolean value = Files.deleteIfExists(path);
            if(value) System.out.println("File deleted successfully");
            else System.out.println("File does not exist");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
