package general_programming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadingFileLineByLine {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("createdfile.txt");
            BufferedInputStream bs = new BufferedInputStream(fs);

            int i = bs.read();

            while(i != -1) {
                System.out.println((char) i);
                i = bs.read();
            }
            bs.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
