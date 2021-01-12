package general_programming;

import java.io.File;

public class GetFileExtension {
    public static void main(String[] args) {
        File file =  new File("sample.txt");
        String fileName = file.toString();
        int index = fileName.lastIndexOf('.');

        if(index > 0) {
            String extension = fileName.substring(index+1);
            System.out.println("File extension is : " + extension);
        }
    }
}
