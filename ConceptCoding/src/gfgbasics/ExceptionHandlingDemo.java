package gfgbasics;

class DhineshException extends  Exception {

}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        try{
            int a = 5/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Here is an error");
            e.printStackTrace();
        } finally {
            System.out.println("I will run always");
        }

        System.out.println("After the exception");

    }
}
