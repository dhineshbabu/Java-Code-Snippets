package general_programming;

import java.util.ArrayList;
import java.util.Arrays;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class CreateCustomUncheckedException {
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python", "javascript"));

    public void checkLanguage(String language) {
        if(languages.contains(language)) {
            throw new CustomUncheckedException(language + " already exists");
        } else {
            languages.add(language);
            System.out.println(language+" is added to the languages list");
        }
    }

    public static void main(String[] args) {
        CreateCustomUncheckedException obj = new CreateCustomUncheckedException();
        obj.checkLanguage("java");
        obj.checkLanguage("ruby");
    }
}
