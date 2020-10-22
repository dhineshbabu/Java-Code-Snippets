package com.kanu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNext = scanner.hasNextInt();
        if(hasNext) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //to handle the next line character. Enter Key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are "+ age + "years old");
            } else {
                System.out.println("Invalid year of birth");;
            }
        } else {
            System.out.println("Unable to parse the year of birth..");
        }
        scanner.close();
    }
}
