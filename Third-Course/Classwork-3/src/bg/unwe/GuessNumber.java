package bg.unwe;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double randomNumber = Math.random() * 10;

        System.out.print("Your guess: ");
        double num = scanner.nextDouble();

        if (!(num == randomNumber)) {
            System.out.println("Your guess is false - it was " + randomNumber + "!");
        }
    }
}