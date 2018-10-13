package bg.unwe;

import java.util.Scanner;

public class Hypotenuse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A: ");
        int a = scanner.nextInt();
        System.out.println("Side A is " + a);

        System.out.println("Please enter side B: ");
        int b = scanner.nextInt();
        System.out.println("Side B is " + b);

        double c = Math.sqrt(a * a + b * b);
        System.out.println("The length of the hypotenuse is " + c);
    }
}