package bg.unwe;

import java.util.Scanner;

public class DistanceCalculator2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double speed, hours;

        System.out.println("Please tell me your average speed: ");
        speed = s.nextDouble();

        System.out.println("Please tell me how many hours you've travelled: ");
        hours = s.nextDouble();

        double distance = speed * hours;
        System.out.println("The distance is " + distance + " km");
    }
}
