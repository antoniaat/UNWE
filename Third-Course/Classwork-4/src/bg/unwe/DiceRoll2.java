package bg.unwe;

import java.util.Scanner;

public class DiceRoll2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desired sum for two rolls: ");
        int desiredSum = scanner.nextInt();

        if (desiredSum < 2) {
            System.out.println("The sum of two rolls cannot be less than 2");
            return;
        } else if (desiredSum > 12) {
            System.out.println("The sum of two rolls cannot be greater than 12");
            return;
        }

        int firstNumber = (int) Math.floor((Math.random() * 6) + 1);
        int secondNumber = (int) Math.floor((Math.random() * 6) + 1);
        int sum = firstNumber + secondNumber;
        System.out.println("First row was " + firstNumber + ", second roll was " + secondNumber + ", the sum is " + sum);

        boolean result = false;
        if (sum == desiredSum) {
            result = true;
        }

        System.out.println("Win: " + result);

    }
}
