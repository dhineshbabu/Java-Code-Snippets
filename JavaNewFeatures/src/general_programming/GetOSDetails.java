package general_programming;

public class GetOSDetails {
    public static void main(String[] args) {
        String OSName = System.getProperty("os.name");
        String OSVersion = System.getProperty("os.version");
        System.out.println(OSName);
        System.out.println(OSVersion);
    }
}
