package general_programming;

import java.io.File;
import java.io.FileWriter;

public class CreateAndWriteToFile {
    public static void main(String[] args) {
        try {
            File file = new File("createdfile.txt");
            boolean status = file.createNewFile();
            if(status) {
                FileWriter output = new FileWriter(file);
                output.write("THis is sample texyt from java program");
                output.close();
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
