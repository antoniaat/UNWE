package bg.unwe;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3.cappuccino\t0 .85\n4.coffee with milk\t0 .90\n5.caffeinefree\t0 .60\n ";

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        System.out.println(menu);
        System.out.print("Your choice: ");
        double choice = scanner.nextDouble();

        if (choice < 1 || choice > 5) {
            System.out.println("Please select from the menu");
            return;
        }

        if (choice == 1) {
            amount -= 0.50;
        } else if (choice == 2) {
            amount -= 0.60;
        } else if (choice == 3) {
            amount -= 0.85;
        } else if (choice == 4) {
            amount -= 0.90;
        } else if (choice == 5) {
            amount -= 0.60;
        }

        if (amount > 0.0) {
            System.out.println("Preparing your drink...");
            System.out.printf("Change: %.2f", amount);
        } else if (amount == 0) {
            System.out.println("Preparing your drink...");
        } else if (amount < 0) {
            System.out.println("Not enough money");
        }
    }
}
