package general_programming;

import java.io.FileInputStream;
import java.io.InputStream;

public class LoadingTextFileasInputStream {
    public static void main(String[] args) {
        try {
            InputStream stream = new FileInputStream("sample.txt");
            System.out.println("Data in the file: ");
            int i = stream.read();

            while(i != -1) {
                System.out.println((char)i);
                i = stream.read();
            }
            stream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
