package general_programming;

import java.io.File;

public class GetFileDetails {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        String fileName = file.getName();
        String fileAbsPath = file.getAbsolutePath();
        System.out.println(fileName);
        System.out.println(fileAbsPath);
    }
}
