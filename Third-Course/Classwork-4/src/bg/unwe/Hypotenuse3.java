package bg.unwe;

import java.util.Scanner;

public class Hypotenuse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        if (a <= 0) {
            System.out.println("The side A cannot be less than or equal to zero");
            return;
        }

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (b <= 0) {
            System.out.println("The side B cannot be less than or equal to zero");
            return;
        }

        if (a == b) {
            System.out.println("This is an isosceles triangle.");
        }

        double length = Math.sqrt(a * a + b * b);

        System.out.printf("The length is %.2f\n", length);
    }
}
