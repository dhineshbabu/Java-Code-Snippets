package functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}

public class ParallelStreamsDemo {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Kani", 90),
                new Student("Perf", 65),
                new Student("Engg", 50),
                new Student("Bru", 88),
                new Student("Dhinesh", 20)
        );

        // normal streams
        System.out.println("*** using normal streams ***");
        double start= System.nanoTime();
        studentList.stream()
                .filter(x -> x.getScore() > 80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName()+ " " + stu.getScore()));
        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Sequential: " + duration);

        // using parallel streams
        // can also be written by stream().parallel() in the above code
        System.out.println("*** using parallel streams ***");
        double start1= System.nanoTime();
        studentList.parallelStream()
                .filter(x -> x.getScore() > 80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName()+ " " + stu.getScore()));
        double duration1 = (System.nanoTime() - start1) / 1_000_000;
        System.out.println("Parallel: " + duration1);
    }
}
