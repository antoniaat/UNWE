package bg.unwe;

import java.util.Scanner;

public class ProgressionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of the first element: ");
        int a1 = scanner.nextInt();

        System.out.print("Please enter the value of the step: ");
        int d = scanner.nextInt();

        System.out.print("Please enter the value of the last element: ");
        int n = scanner.nextInt();

        int result = ((2 * a1 + (n - 1) * d) / 2) * n;
        System.out.println("The sum of the first " + n + " elements is " + result);
    }
}
