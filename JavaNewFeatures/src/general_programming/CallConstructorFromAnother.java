package general_programming;

public class CallConstructorFromAnother {
    int sum;

    public CallConstructorFromAnother() {
        this(5,2);
    }

    public CallConstructorFromAnother(int arg1, int arg2) {
        this.sum = arg1 + arg2;
    }

    void display() {
        System.out.println("Sum is " + this.sum);
    }

    public static void main(String[] args) {
        CallConstructorFromAnother obj = new CallConstructorFromAnother();
        obj.display();
    }

}
