package general_programming;

import java.io.File;

public class RenameAFile {
    public static void main(String[] args) {
        File file = new File("oldName.txt");

        //create a file
        try{
            file.createNewFile();
        } catch (Exception e) {
            e.getStackTrace();
        }

        File newFile = new File("newName.txt");

        boolean value = file.renameTo(newFile);

        if(value) {
            System.out.println("The name of the file is changed..");
        } else {
            System.out.println("The name of the file can not be changed ");
        }
    }
}
