package bg.unwe;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Limit: ");
        Integer limit = scanner.nextInt();

        System.out.println(0);
        System.out.println(1);
        System.out.println(1);

        Integer previousPrevious = 1;
        Integer previous = 1;
        Integer current = previousPrevious + previous;

        for (int i = 3; i < limit; i++) {
            System.out.println(current);
            previousPrevious = previous;
            previous = current;
            current = previous + previousPrevious;
        }
    }
}
