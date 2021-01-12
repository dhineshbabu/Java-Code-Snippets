package general_programming;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("sampledirectory");
        boolean value = file.mkdir();
        if(value) {
            System.out.println("Directory Created");
        } else {
            System.out.println("Directory creation failed");
        }
    }
}
