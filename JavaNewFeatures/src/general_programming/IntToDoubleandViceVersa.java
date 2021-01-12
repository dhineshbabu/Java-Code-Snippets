package general_programming;

public class IntToDoubleandViceVersa {
    public static void main(String[] args) {

        //Int to DOuble conversion
        int a = 23;
        Double obj = Double.valueOf(a);
        System.out.println(obj);

        // direct typecasting
        double d1 = a;
        System.out.println(d1);

        // double to int conversion
        double a1 = 23.78D;
        double b1 = 52.11D;

        //using typecasting
        int num1 = (int)a1;
        int num2 = (int)b1;
        System.out.println(num1);
        System.out.println(num2);

        // using intValue() method
        Double obj1 = 10.63;
        int num3 = obj.intValue();
        System.out.println(num3);


    }
}
