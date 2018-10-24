package bg.unwe;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of the first element: ");
        int a1 = scanner.nextInt();

        System.out.print("Please enter the value of the step: ");
        int step = scanner.nextInt();

        System.out.print("Please enter the number of the element you'd want to be calculated: ");
        int n = scanner.nextInt();

        int result = a1 + (n - 1) * step;
        System.out.println("Element " + n + " is " + result);
    }
}
