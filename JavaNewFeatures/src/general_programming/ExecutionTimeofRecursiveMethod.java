package general_programming;

public class ExecutionTimeofRecursiveMethod {
    public int factorial(int n) {
        if(n!=0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        ExecutionTimeofRecursiveMethod obj = new ExecutionTimeofRecursiveMethod();

        long start = System.nanoTime();

        obj.factorial(10);

        long end = System.nanoTime();

        long execution = end-start;
        System.out.println("Total time for the recursive call : " + execution);
    }
}
