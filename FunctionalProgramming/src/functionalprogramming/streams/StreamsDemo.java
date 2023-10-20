package functionalprogramming.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void filterDemo() {
        List<Integer> al = Arrays.asList(10,23,24,15,30,34);
        //another collection to add even data to the above collection
        List<Integer> targetList = new ArrayList<>();

        //using streams
        System.out.println("*** copying to target list ***");
        targetList = al.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        System.out.println(targetList);

        // printing the data - foreach method
        System.out.println("*** forEach method ***");
        targetList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        // filtering with multiple conditions
        System.out.println("*** multiple filters ***");
        targetList.stream()
                .filter(n -> n%2 == 0)
                .filter(n -> n>=30) // we can add this in same predicate with &&
                .forEach(System.out::println);

        // Working with nulls - removing nulls
        System.out.println("*** handling nulls ***");
        List<String> words = Arrays.asList("kani", null, "bru", "dhinesh", null);
        List<String> noNullStringList = words.stream()
                .filter(Objects::nonNull) // can be replaced with lambda x -> x!=null
                .toList();
        System.out.println(noNullStringList);

    }

    public static void mapDemo() {
        System.out.println("*** upper casing list elements ***");
        List<String> names = Arrays.asList("kani", "perf", "engineer");
        List<String> upperCased = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCased);


        System.out.println("*** finding length of each element ***");
        List<Integer> lengths =  names.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
    }

    public static void flatmapDemo() {
        // flatmap is a map for flattening the elements
        // returns stream of object
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);

        System.out.println("*** ading the above 3 collection ***");
        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
        List<Integer> finalResults = finalList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(finalResults);

        System.out.println("*** adding the above 3 collection + 10 ***");
        List<List<Integer>> finalList1 = Arrays.asList(list1, list2, list3);
        List<Integer> finalResults1 = finalList1.stream()
                .flatMap(x -> x.stream().map(y->y+10))
                .collect(Collectors.toList());

        System.out.println(finalResults1);
    }

    public static void distinctCountLimit() {

        // distinct() method
        // finding unique objects in the collection
        System.out.println("*** distinct ***");
        List<String> vehicleList = Arrays.asList("bus", "car", "bus", "car", "bike", "cycle");
        List<String> uniqueVehicles = vehicleList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueVehicles);

        // count() method - to get the count
        System.out.println("*** count ***");
        long count = vehicleList.stream().distinct().count();
        System.out.println(count);

        // limit() - to restrict the outcome
        System.out.println("*** limit ***");
        List<String> top3 = vehicleList.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3); //[bus, car, bus]

    }

    public static void minMax() {
        // min()
        System.out.println("*** min ***");
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> min = numberList.stream()
                .min((val1, val2) -> {return val1.compareTo(val2);});
        System.out.println(min.get());

        // max()
        System.out.println("*** max ***");
        List<Integer> numberList1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> max = numberList.stream()
                .max((val1, val2) -> {return val1.compareTo(val2);});
        System.out.println(max.get());
    }

    public static void reduceDemo() {
        System.out.println("*** reduce ***");
        List<String> stringList = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
        Optional<String> reducedString = stringList.stream()
                .reduce((value, combinedValue) -> {
                    return value+combinedValue;
                });
        System.out.println(reducedString.get()); // ABCD123

    }

    public static void toArrayDemo() {
        System.out.println("*** toArray ***");
        List<String> stringList = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
        Object[] arr = stringList.stream().toArray();
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
//        filterDemo();
//        mapDemo();
//        flatmapDemo();
//        distinctCountLimit();
//        minMax();
//        reduceDemo();
        toArrayDemo();
    }

}
