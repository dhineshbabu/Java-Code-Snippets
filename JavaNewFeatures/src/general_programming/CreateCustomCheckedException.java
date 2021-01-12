package general_programming;

import java.util.ArrayList;
import java.util.Arrays;

class CustomChckedException extends Exception {
    public CustomChckedException(String message) {
        super(message);
    }
}

public class CreateCustomCheckedException {
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python", "javascript"));

    public void checkLanguage(String language) throws CustomChckedException {
        if(languages.contains(language)) {
            throw new CustomChckedException(language + "already exists.");
        } else {
            languages.add(language);
        }
    }

    public static void main(String[] args) {
        CreateCustomCheckedException obj = new CreateCustomCheckedException();

        try {
            obj.checkLanguage("java");
            obj.checkLanguage("ruby");
        } catch (CustomChckedException e) {
            System.out.println("[" + e + "] Exception Occurred");
        }
    }
}
