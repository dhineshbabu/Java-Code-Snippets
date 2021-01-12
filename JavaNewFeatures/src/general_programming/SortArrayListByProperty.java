package general_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListByProperty {
    private String customProperty;

    public SortArrayListByProperty(String customProperty) {
        this.customProperty = customProperty;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public static void main(String[] args) {
        ArrayList<SortArrayListByProperty> list = new ArrayList<>();
        list.add(new SortArrayListByProperty("Z"));
        list.add(new SortArrayListByProperty("A"));
        list.add(new SortArrayListByProperty("B"));
        list.add(new SortArrayListByProperty("X"));
        list.add(new SortArrayListByProperty("Aa"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        list.stream().forEach(l1 -> System.out.println(l1.getCustomProperty()));
    }


}
