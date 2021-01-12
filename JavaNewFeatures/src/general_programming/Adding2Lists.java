package general_programming;

import java.util.ArrayList;
import java.util.List;

public class Adding2Lists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Dhinesh");
        list1.add("Babu");
        List<String> list2 = new ArrayList<>();
        list2.add("Kanu");
        list2.add("Hasini");
        List<String> joined = new ArrayList<>();
        joined.addAll(list1);
        joined.addAll(list2);
        System.out.println(joined);
    }
}
