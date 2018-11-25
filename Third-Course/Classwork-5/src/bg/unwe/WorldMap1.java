package bg.unwe;

import java.util.Scanner;

public class WorldMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Latitude 1: ");
        double latitude1 = scanner.nextDouble();

        System.out.print("Longitude 1: ");
        double longitude1 = scanner.nextDouble();

        System.out.print("Latitude 2: ");
        double latitude2 = scanner.nextDouble();

        System.out.print("Longitude 2: ");
        double longitude2 = scanner.nextDouble();

        if (latitude1 == latitude2 && longitude1 == longitude2) {
            System.out.println("This is the same place");
            return;
        }

        double latitudeDiff = latitude2 - latitude1;
        double longitudeDiff = longitude2 - longitude1;

        System.out.println("GPS 1: " + latitude1 + " " + longitude1);
        System.out.println("GPS 2: " + latitude2 + " " + longitude2);

        if (latitudeDiff != 0 && longitudeDiff != 0) {
            if (latitudeDiff < 0 && longitudeDiff < 0) {
                System.out.println("SOUTHWEST");
            } else if (latitudeDiff < 0 && longitudeDiff > 0) {
                System.out.println("SOUTHEAST");
            } else if (latitudeDiff > 0 && longitudeDiff > 0) {
                System.out.println("NORTHEAST");
            } else if (latitudeDiff > 0 && longitudeDiff < 0) {
                System.out.println("NORTHWEST");
            }
        } else if (latitudeDiff != 0 && longitudeDiff == 0) {
            if (latitudeDiff > 0) {
                System.out.println("NORTH");
            } else if (latitudeDiff < 0) {
                System.out.println("SOUTH");
            }
        } else if (longitudeDiff != 0 && latitudeDiff == 0) {
            if (longitudeDiff > 0) {
                System.out.println("EAST");
            } else if (longitudeDiff < 0) {
                System.out.println("WEST");
            }
        }

//        42,650766
//        23,348700
//        42,564053
//        23,278525
    }
}
