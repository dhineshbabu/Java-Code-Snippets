package general_programming;

final class ImmutableClass {
    private String name;
    private int date;

    ImmutableClass(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
}

public class CreateImmutableClass {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass("Dhineshbabu", 2020);
        System.out.println(obj.getName());
        System.out.println(obj.getDate());
    }
}
