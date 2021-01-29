package java12;

public class SwitchExpression {
    public static void main(String[] args) {
        // until java 11 , switch is a statement and will not return any value by default
        // IN java 12, we can use switch as expression also multi label case statements available
        // Default is mandatory with switch expressions
        var i = 10;
        var result = switch (i) {
            case 5:
            case 10:
                yield "Five or Ten";
            case 15:
            case 20: // can be given as "case 15,20"
                yield "Fifteen or Twenty";
            default:
                yield "Not the above";
        };

        System.out.println(result);
    }
}
