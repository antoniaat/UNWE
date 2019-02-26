package bg.unwe;

import java.util.Scanner;

public class WindTurbine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the wind speed (in m/s): ");
        double w = scanner.nextDouble();

        System.out.print("Enter the blade length (in m): ");
        double b = scanner.nextDouble();

        double power = ((1.23/2) * Math.PI * Math.pow(b,2) * Math.pow(w,3)) / 1000000;

        System.out.println("The wind power is " + power + " MW");
//        System.out.printf("The wind power is %.2f mw", power);
    }
}
