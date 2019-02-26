package bg.unwe;

import java.util.Scanner;

public class QuadraticEquations3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();

        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Enter C: ");
        int c = scanner.nextInt();

        if (a == 0) {
            System.out.println("a cannot be zero");
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No solution");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);

            double x2 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);

            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f", x2);
        }
    }
}
