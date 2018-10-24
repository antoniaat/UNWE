package bg.unwe;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double h = scanner.nextDouble();

        double result = (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
        System.out.println("The volume of the cone is " + result);
    }
}
