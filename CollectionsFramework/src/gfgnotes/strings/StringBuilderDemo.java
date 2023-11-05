package gfgnotes.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("kani");
        System.out.println(sb);
      StringBuilder sb2 =  sb.append("perf");
        System.out.println(sb == sb2); // will be the same
    }
}
