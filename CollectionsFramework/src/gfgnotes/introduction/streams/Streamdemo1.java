package gfgnotes.introduction.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamdemo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,25,42,56);


        list.stream()
                .filter(x -> x%2 == 0)
                .filter(x -> x > 10)
                .forEach(System.out::println);

        int arr[] = {30, 20, 10};

        int sum = Arrays.stream(arr)
                .sum();
        System.out.println(sum);

        // max returns optional int that's why we use getAsInt
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println(max);

        // print only int wih char 5 in it
        Stream.iterate(1,x->x+1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);


        //
    }


}
