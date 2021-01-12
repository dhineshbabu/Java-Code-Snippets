package general_programming;

public class CapitalizeFirstLetterString {
    public static void main(String[] args) {
        String input = "this is random string to capitalize";
        String[] tokens = input.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String str: tokens) {
            String modifiedString = str.toUpperCase().charAt(0)+str.substring(1,str.length());
            sb.append(modifiedString+" ");
        }
        System.out.println(sb.toString());

    }
}
