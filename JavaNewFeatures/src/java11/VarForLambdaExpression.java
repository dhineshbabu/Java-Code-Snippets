package java11;

interface Calcultor {
    int add(int a, int b);
}

public class VarForLambdaExpression {
    public static void main(String[] args) {
        // var now can be used as a parameter for lambda expression
        Calcultor cal = (var x, var y) -> x+y;
        System.out.println(cal.add(10, 30));
        System.out.println(cal.add(40, 59));
        //We must provide var for all Lambda parameters, not for few lambda parameters.
        //Calculator cal = (var i, j) -> i+j  => This is invalid
        // if we use var then () is mandatory
    }
}
