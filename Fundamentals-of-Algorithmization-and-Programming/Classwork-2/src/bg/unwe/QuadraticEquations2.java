package bg.unwe;

import java.util.Scanner;

public class QuadraticEquations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double d = (Math.pow(b, 2)) - (4 * a * c);

        double x1 = (-b - (Math.sqrt(d))) / (2 * a);
        double x2 = (-b + (Math.sqrt(d))) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}