package java12;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

public class StringClassNewMethods {
    public static void main(String[] args) {
        /*
        indent() - to add or remove spaces at the beginning of string
        transform()
        describeConstable()
        resolveConstableDesc()
         */

        //indent() method
        String str1 = "Dhinesh\nbabu\nsolutions";
        System.out.println(str1);
        System.out.println(str1.indent(5)); // will add 5 spaces infront of each line
        System.out.println();

        String str2 = "     Dhinesh\n     babu";
        System.out.println(str2.indent(-5)); // will remove 5 spaces infront of each line

        String str3 = "     Dhinesh\n     babu";
        System.out.println(str3.indent(-3)); //only removes 3 spaces infront of each line

        String str4 = "     Dhinesh\n     babu";
        System.out.println(str4.indent(0)); // nothing will happen

        //tranform() method -  to transform string into some other form by taking a string as parameter
        String str5 = "DHINESH";
        String newString = str5.transform(s->s.toUpperCase());
        String newString2 = str5.transform(s -> s.toLowerCase());
        System.out.println(newString);
        System.out.println(newString2);

        //describeConstable() - to describe same object as optional
        System.out.println(str5.describeConstable());
        Optional<String> opt = str5.describeConstable();
        System.out.println(opt.get());

        //resolveConstableDesc(lookup) - will return the same object
        System.out.println(str5.resolveConstantDesc(null));


    }
}
