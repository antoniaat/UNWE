package bg.unwe;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The diameter of the sphere: ");
        double diameter = scanner.nextDouble();
        double radius = diameter / 2;

        double volume = (4 * Math.PI * (Math.pow(radius, 3)) / 3);
        double surface = 4 * Math.PI * Math.pow(radius, 2);

        double v = (double)Math.round(volume * 10000d) / 10000d;
        double s = (double)Math.round(surface * 10000d) / 10000d;

        System.out.println("The volume of a sphere with diameter " + diameter + "  is " + v);
        System.out.println("The surface area is " + s);
    }
}
