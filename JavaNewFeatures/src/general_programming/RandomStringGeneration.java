package general_programming;

import java.util.Random;

public class RandomStringGeneration {
    public static void main(String[] args) {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String alphanumeric = upperAlphabet+lowerAlphabet+numbers;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;

        for(int i=0; i<length;i++){
            int index = random.nextInt(alphanumeric.length());
            char randomChar = alphanumeric.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Random String: " + randomString);
    }
}
