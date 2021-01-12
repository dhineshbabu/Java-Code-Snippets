package general_programming;

import java.util.ArrayList;

public class CustomArrayListSort {
    private String customProperty;

    public CustomArrayListSort(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<CustomArrayListSort> list = new ArrayList<>();
        list.add(new CustomArrayListSort("Z"));
        list.add(new CustomArrayListSort("A"));
        list.add(new CustomArrayListSort("B"));
        list.add(new CustomArrayListSort("X"));
        list.add(new CustomArrayListSort("Aa"));

        list.sort((o1, o2) -> o2.getCustomProperty().compareTo(o1.getCustomProperty()));

        for (CustomArrayListSort obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
}
