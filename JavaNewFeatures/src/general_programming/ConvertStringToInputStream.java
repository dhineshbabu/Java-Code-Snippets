package general_programming;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ConvertStringToInputStream {
    public static void main(String[] args) {
        String name = "Dhinesh";
        try{
            InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
            System.out.println("Available bytes at the beginning: " + stream.available());
            stream.read();
            stream.read();
            stream.read();
            System.out.println("Available bytes at the end: " + stream.available());
            stream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
