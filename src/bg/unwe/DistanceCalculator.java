package bg.unwe;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = 78.2;
        double hours = 1.5;
        double distance = speed * hours;

        System.out.println("The distance is " + distance + " km");
    }
}
