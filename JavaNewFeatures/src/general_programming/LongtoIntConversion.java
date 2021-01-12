package general_programming;

public class LongtoIntConversion {
    public static void main(String[] args) {
        //using type casting
        long a = 2322331L;
        long b = 52341241L;

        int c = (int)a;
        int d = (int)b;

        System.out.println(c);
        System.out.println(d);

        //Using intValue() function

        Long obj = 52341241L;

        int e = obj.intValue();
        System.out.println(Integer.class.isInstance(e)); // This is integer
        System.out.println(obj.getClass().getName()); // This is Long

    }
}
