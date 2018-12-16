package bg.unwe;

import java.util.Scanner;

public class SumIfLarger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nextNumber = 0;
        Integer previousNumber = nextNumber;
        Integer sum = 0;

        System.out.print("Next: ");

        while((nextNumber = scanner.nextInt()) > previousNumber) {
            sum += nextNumber;

            previousNumber = nextNumber;
            System.out.print("Next: ");
        }

        System.out.println("Result: " + sum);
    }
}
