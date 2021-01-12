package general_programming;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertInputStreamToByteArray {
    public static void main(String[] args) {
        try{
            byte[] input = {1,2,3,4};
            InputStream is = new ByteArrayInputStream(input);
            System.out.println("Input Stream: " + is);

            byte[] array = is.readAllBytes();
            System.out.println("Byte Array : " + Arrays.toString(array));
            is.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
