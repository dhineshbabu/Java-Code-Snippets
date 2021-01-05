package java8;

class Sample {
    private String s;
    Sample(String s) {
        this.s = s;
        System.out.println("Constructor Executed " + s);
    }
}

interface Interf6 {
    public Sample get(String s);
}

public class Java8_ConstructorReference {
    public static void main(String[] args) {
        Interf6 f = s -> new Sample(s);
        f.get("From Lambda Expression");
        Interf6 f1 = Sample::new;
        f.get("from constructor reference");
    }

}
