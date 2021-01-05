package java10;

import java.util.ArrayList;
import java.util.List;

public class CollectionAPI_Changes {
    public static void main(String[] args) {
        //Creating unmodifiable collections with copyOf() method (applicable for sets and maps as well)
        List<String> al = new ArrayList<>();
        al.add("Dhinesh");
        al.add("Kanu");
        var newList = List.copyOf(al);
        System.out.println(newList);
        newList.add("cant add"); //UnsupportedOperationException
        System.out.println(newList);
    }
}
