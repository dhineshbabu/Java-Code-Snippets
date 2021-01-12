package general_programming;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String source = "   sdg  dfgfdg fdgfdgfdg   ";
        source = source.replaceAll("\\s","");
        System.out.println(source);
    }
}
