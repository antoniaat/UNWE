package bg.unwe;

import java.util.Scanner;

public class AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("External temp: ");
        double externalTemp = scanner.nextDouble();

        System.out.print("Internal temp: ");
        double internalTemp = scanner.nextDouble();

        System.out.print("Desired temp: ");
        double desiredTemp = scanner.nextDouble(); //Желана температура.

        if (desiredTemp < internalTemp && externalTemp > internalTemp) {
            System.out.println("MAX COLD MODE");
        } else if (desiredTemp < internalTemp && externalTemp <= internalTemp) {
            System.out.println("ENERGY SAVING COLD MODE");
        } else if (desiredTemp > internalTemp && externalTemp < internalTemp) {
            System.out.println("MAX WARM MODE");
        } else if (desiredTemp > internalTemp && externalTemp >= internalTemp) {
            System.out.println("“ENERGY SAVING WARM MODE");
        }
    }
}
