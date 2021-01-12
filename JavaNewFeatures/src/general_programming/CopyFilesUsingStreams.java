package general_programming;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFilesUsingStreams {
    public static void main(String[] args) {
        byte[] array = new byte[50];
        try {
            FileInputStream fi = new FileInputStream("sample.txt");
            FileOutputStream fo = new FileOutputStream("newName.txt");

            fi.read(array);
            fo.write(array);

            fi.close();
            fo.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
