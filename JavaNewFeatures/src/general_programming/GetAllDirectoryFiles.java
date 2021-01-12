package general_programming;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetAllDirectoryFiles {
    public static void main(String[] args) {
        File file = new File("//home//dhinesh//Desktop//Dhinesh_Folders//Harlyzer");
        String[] fileList = file.list();
        for(String str: fileList) {
            System.out.println(str);
        }
    }
}
