package general_programming;

public class ClearStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Dhinesh");
        str.append("Babu");
        str.append("Java");
        System.out.println(str);
        str.delete(0,str.length());
        System.out.println("After deleting:" + str);

        //set length = 0
        str.append("Dhinesh");
        str.append("Babu");
        str.append("Java");
        System.out.println(str);
        str.setLength(0);
        System.out.println("After deleting:" + str);

        //create using new kyeword
        str.append("Dhinesh");
        str.append("Babu");
        str.append("Java");
        System.out.println(str);
        str = new StringBuffer();
        System.out.println("After deleting:" + str);
    }
}
