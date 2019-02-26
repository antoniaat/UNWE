package bg.unwe;

import java.util.Scanner;

public class ConeVolume2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();

        if (radius <= 0) {
            PrintMessage("Radius must be > 0");
            return;
        }

        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        if (height <= 0) {
            PrintMessage("Height must be > 0");
            return;
        }

        double volume = Math.PI * Math.pow(radius, 2) * (height / 3d);
        System.out.printf("The volume of the cone is %.2f", volume);
    }

    public static void PrintMessage(String message) {
        System.out.println(message);
    }
}
