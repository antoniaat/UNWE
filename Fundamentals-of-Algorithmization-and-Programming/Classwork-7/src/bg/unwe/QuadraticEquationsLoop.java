package bg.unwe;

import java.util.Scanner;

public class QuadraticEquationsLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Limit: ");
        Integer limit = s.nextInt();
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

                    double d = (b * b) - (4 * a * c);

                    if (d < 0) {
                        System.out.println("No solution");
                    } else if (d == 0) {
                        double x1 = -b / (2 * a);
                        System.out.println("x1 = " + x1);
                    } else {
                        double x1 = (-b - Math.sqrt(d)) / (2 * a);
                        double x2 = (-b + Math.sqrt(d)) / (2 * a);
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                }
            }
        }
    }
}