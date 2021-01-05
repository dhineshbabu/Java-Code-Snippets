package java8;

interface Interf {
    public void  methodOne();
}

//another functional interface with arguments

interface Interf2 {
    public int methodTwo(int a, int b);
}


public class Java8_LambdaExpr {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("Method one from functional interface");
        i.methodOne();
        Interf2 i1 = (a,b) -> a+b;
        System.out.println(i1.methodTwo(2,3));
    }
}
