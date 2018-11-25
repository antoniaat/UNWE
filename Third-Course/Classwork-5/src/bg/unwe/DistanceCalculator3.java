package bg.unwe;

import java.util.Scanner;

public class DistanceCalculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Speed (in km/h): ");
        double speed = scanner.nextDouble();

        if (speed <= 0) {
            System.out.println("Invalid speed");
            return;
        } else if (speed > 100) {
            System.out.println("You are driving too fast!");
        }

        System.out.print("Duration (in hours): ");
        double hours = scanner.nextDouble();

        if (hours <= 0) {
            System.out.println("Invalid duration");
            return;
        } else if (hours > 10) {
            System.out.println("You need some rest!");
        }

        double distance = speed * hours;
        System.out.printf("Distance: %.2f km.", distance);
    }
}
