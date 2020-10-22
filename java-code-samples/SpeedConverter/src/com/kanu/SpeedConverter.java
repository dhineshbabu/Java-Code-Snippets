package com.kanu;

public class SpeedConverter {

    public  static long toMilesPerHour(double kiloMetersPerHour) {
        if(kiloMetersPerHour <= 0) {
            return -1;
        }

        return Math.round(kiloMetersPerHour / 1.609);
    }

    public  static void printConversion(double kiloMetersPerHour){

        if(kiloMetersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kiloMetersPerHour);
            System.out.println(kiloMetersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
