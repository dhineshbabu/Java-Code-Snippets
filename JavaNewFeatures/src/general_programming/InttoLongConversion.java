package general_programming;

public class InttoLongConversion {
    public static void main(String[] args) {
        int a = 25;
        int b = 34;

        long c = a;
        long d = b;

        System.out.println(Long.class.isInstance(c));
        System.out.println(Long.class.isInstance(d));

        // Using valueOf method
        Integer e = 325;
        long l = e.longValue();
        System.out.println(Long.class.isInstance(l));

        // using valueOf(0 method
        Long l2 = Long.valueOf(e);
        System.out.println(l2.getClass().getName());

    }
}
