package com.kanu;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Kanu 1");
                break;

            case 2:
                System.out.println("Kanu 2");
                break;

            case 3: case 4:
                System.out.println("sample case");
                break;

            default:
                System.out.println("Oh this is Dhinesh");
                break;
        }
    }
}
