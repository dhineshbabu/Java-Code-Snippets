package general_programming;

import java.nio.file.Paths;

public class CurrentWorkingDirectory {
    public static void main(String[] args) {
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);

        //another method
        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println(path);
    }
}
