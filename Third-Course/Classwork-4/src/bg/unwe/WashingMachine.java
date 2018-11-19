package bg.unwe;

import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a programme: ");
        double programme = scanner.nextInt();

        if (programme == 1) {
            System.out.println("Temperature: 60 degrees, Time: 125 minutes");
        } else if (programme == 2) {
            System.out.println("Temperature: 90 degrees, Time: 106 minutes");
        } else if (programme == 3) {
            System.out.println("Temperature: 40 degrees, Time: 98 minutes");
        } else if (programme == 4) {
            System.out.println("Temperature: 50 degrees, Time: 65 minutes");
        } else if (programme == 5) {
            double temperature = scanner.nextDouble();
            double time = scanner.nextDouble();

            System.out.println("Temperature: " + temperature + " degrees, Time: " + time + " minutes");
        } else {
            System.out.println("No such programme");
        }
    }
}
