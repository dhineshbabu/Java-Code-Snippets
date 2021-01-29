package java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorinStreams {
    public static void main(String[] args) {
        // To take 2 streams and do operations on it
        double mean = Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.teeing(
                Collectors.summingDouble(x->x),
                Collectors.counting(),
                (sum, count) -> sum/count));

        System.out.println("Mean is : " + mean);
    }
}
