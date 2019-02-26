package bg.unwe;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desired sum for two rolls: ");
        int desiredSum = scanner.nextInt();

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
