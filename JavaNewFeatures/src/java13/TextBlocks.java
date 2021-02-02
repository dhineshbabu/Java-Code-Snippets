package java13;

public class TextBlocks {
    public static void main(String[] args) {
        var str1 = "This content is from text blocks";

        var str2 = """
         This content is from text blocks""";

        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
