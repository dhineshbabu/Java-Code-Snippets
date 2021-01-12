package general_programming;

public class EnumLookUp {
    public enum TextStyle {
        BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
    }
    public static void main(String[] args) {
        String style = "Bold";
        TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());
        System.out.println(textStyle);
    }
}
