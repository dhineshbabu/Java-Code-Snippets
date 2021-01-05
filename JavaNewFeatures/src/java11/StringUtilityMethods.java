package java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtilityMethods {

    public static void main(String[] args) {
        // repeat() method
        String name = "Dhinesh";
        System.out.println(name.repeat(5)); // 0 will give empty string

        //isBlank() method - checking for empty or space only strings
        System.out.println("Checking empty strings");
        String input = "";
        System.out.println(input.isBlank());
        input = " "; //only space
        System.out.println(input.isBlank());
        input = "some random string but not blank anymore";
        System.out.println(input.isBlank());

        //strip() methods
        String trimString = " This has leading and trailing spaces ";
        System.out.println(trimString);
        System.out.println(trimString.strip());
        System.out.println(trimString.stripLeading());
        System.out.println(trimString.stripTrailing());

        //lines() - This method will split a String into no of Tokens in the form of Stream object on the
        //basis of '\n' literals.

        String str = "This\nis\nfrom\nrandom\nstring";
        Stream<String> s = str.lines();
        List<Integer> li = s.map(s1 -> s1.length()).collect(Collectors.toList());
        System.out.println(li);



    }
}
