package general_programming;

public class UniqueWordsInString {
    public static void main(String[] args) {
        String s = "Kanu is awesome test";
        int length = s.trim().split("\\S+").length;
        System.out.println(length);
    }
}
