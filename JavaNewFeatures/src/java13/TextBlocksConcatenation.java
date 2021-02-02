package java13;

public class TextBlocksConcatenation {
    public static void main(String[] args) {
        var str1 = "Dhinesh";
        var str2 = """
                Kanu""";
        var str3 = "Solutions";
        var result = str1+str2+str3;
        System.out.println(result);

        // we can pass text blocks to system.out.println
        System.out.println("""
                Hello 
                this is from 
                text block in 
                sout""");

        // also we can pass text blocks to the functions as parameters

        // using concat() method ad other operations
        var str4 = """
                Hello 
                this is from 
                text block""";
        System.out.println(str4.toUpperCase());
        String[] tokens = str4.split(" ");
        for(String token: tokens) {
            System.out.println(token);
        }

        //spaces will be preserved as we supply in textblocks. Useful in passing json / html / xml data
        var str5 = """
                Dhinesh
                    dhinesh
                dhinesh
                 dhinesh
                """;
        System.out.println(str5);

        // we can use ' and " directly inside textblocks
        var str6 = """
                Hellow tis is ' and this is " """;
        System.out.println(str6);
    }
}
