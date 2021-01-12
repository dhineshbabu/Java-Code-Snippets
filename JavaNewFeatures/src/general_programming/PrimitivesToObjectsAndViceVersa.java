package general_programming;

public class PrimitivesToObjectsAndViceVersa {
    public static void main(String[] args) {
        /*Primitives to Objects*/
        int var1 = 5;
        double var2 = 5.65;
        boolean var3 = true;

        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);

        /* Object to Primitives */
        int newInt = obj1.intValue();
        double newDouble = obj2.doubleValue();
        boolean newBoolean = obj3.booleanValue();

        System.out.println(newInt);
        System.out.println(newDouble);
        System.out.println(newBoolean);
    }
}
