package enumtest;


public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch(today) {
            case MONDAY -> System.out.println("This is Monday");
            case TUESDAY -> System.out.println("This is Tuesday");
        }

        // iterating through the values
        for(Day day : Day.values()){
            System.out.println(day);
        }

        // getting a single value
        Day day = Day.valueOf("MONDAY");
        System.out.println(day);
    }
}
