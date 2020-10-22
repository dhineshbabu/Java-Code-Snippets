package com.kanu;

public class Main {

    public static void main(String[] args) {
	 // write your code here
        Dimensions dimensions = new Dimensions(20,20,30);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Besat", "Acer", 27, new Resolution(2540,1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.powerUp();

        //Composition Challenge Problem

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("Kanu", wall1,wall2,wall3,wall4,ceiling,bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
