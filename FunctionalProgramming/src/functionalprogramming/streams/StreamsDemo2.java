package functionalprogramming.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo2 {

    public static void sortedDemo() {

        // we can apply for string objects as well
        System.out.println("*** sorted ***");
        List<Integer> list1 = Arrays.asList(5,9,4,6,1,4,56,4);
        List<Integer> sortedList = list1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("*** sorting in reverse using Comparator.reverseorder() ***");
        List<Integer> list2 = Arrays.asList(5,9,4,6,1,4,56,4);
        List<Integer> sortedList2 = list2.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList2);
    }

    public static void matchMethods() {
        // anyMatch()
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        System.out.println("*** anyMatch ***");
        boolean result = fruits.stream()
                .anyMatch(value -> {return value.startsWith("One");});
        System.out.println(result);

        System.out.println("*** allMatch ***");
        boolean result2 = fruits.stream()
                .allMatch(value -> {return value.startsWith("One");});
        System.out.println(result2);

        System.out.println("*** NoneMatch ***");
        boolean result3 = fruits.stream()
                .noneMatch(value -> {return value.startsWith("dummy");});
        System.out.println(result3);

    }

    public static void findMethods() {
        List<String> stringList = Arrays.asList("one", "two", "three", "four");

        System.out.println("*** findAny ***");
        Optional<String> element = stringList.stream().findAny();
        System.out.println(element.get());

        System.out.println("*** findFirst ***");
        Optional<String> element1 = stringList.stream().findFirst();
        System.out.println(element1.get());
    }

    public static void concatDemo() {
        List<String> stringList1 = Arrays.asList("one", "two", "three", "four");
        List<String> stringList2 = Arrays.asList("1", "2", "3", "4");

        Stream<String> stream1 = stringList1.stream();
        Stream<String> stream2 = stringList2.stream();

        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(finalList); //[one, two, three, four, 1, 2, 3, 4]
    }


    public static void main(String[] args) {
//        sortedDemo();
//        matchMethods();
//        findMethods();
        concatDemo();
    }


}
