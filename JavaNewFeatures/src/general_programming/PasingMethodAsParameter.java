package general_programming;

public class PasingMethodAsParameter {

    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public void square(int num) {
        System.out.println("Square of the number is : " + (num*num));
    }

    public static void main(String[] args) {
        PasingMethodAsParameter obj = new PasingMethodAsParameter();
        obj.square(obj.add(1,2));
    }
}
