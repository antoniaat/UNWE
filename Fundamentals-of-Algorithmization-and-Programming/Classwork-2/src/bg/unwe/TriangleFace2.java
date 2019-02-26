package bg.unwe;

import java.util.Scanner;

public class TriangleFace2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter A: ");
        double a = scanner.nextDouble();

        System.out.print("Please enter C (hypotenuse): ");
        double c = scanner.nextDouble();

        double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));

        double result = (a * b) / 2;
        System.out.println("The face of the triangle is " + result);
    }
}
