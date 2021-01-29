package java12;

public class SwitchExpressionUsingLambda {

    public static void main(String[] args) {
        var i = 15;
        var result = switch (i) {
            case 5, 10 -> "Five or Ten";
            case 15, 20 -> "Fifteen or Twenty";
            default -> "This is from default case";
        };
        System.out.println(result);
    }
}
