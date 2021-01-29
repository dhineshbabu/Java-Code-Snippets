package java12;

public class SwitchExpression2 {
    public static void main(String[] args) {
        var i = 5;

        var result = switch (i) {
            case 5,10:
                yield "This is five or 10";
            case 15, 20:
                yield "This is fifteen or twenty";
            default:
                yield "This is not the given condition";
        };

        System.out.println(result);
    }
}
