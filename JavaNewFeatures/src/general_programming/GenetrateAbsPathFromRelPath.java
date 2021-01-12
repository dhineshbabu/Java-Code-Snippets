package general_programming;

import java.io.File;
import java.net.URI;

public class GenetrateAbsPathFromRelPath {
    public static void main(String[] args) {
        File file1 = new File("/home/dhinesh/Desktop/Dhinesh_Folders/GitHub_Backup/Java_Code_Snippets/sample.txt");
        File file2 = new File("/home/dhinesh/Desktop/Dhinesh_Folders");
        URI path1 = file1.toURI();
        URI path2 = file2.toURI();

        URI relativePath = path2.relativize(path1);
        String path = relativePath.getPath();
        System.out.println("Relative path is : " + relativePath);
    }
}
