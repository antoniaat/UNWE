package bg.unwe;

import java.util.Scanner;

public class PizzaMaker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 5;

        System.out.print("What type of pizza do you want? ");
        String pizzaType = scanner.next();

        if (!pizzaType.equalsIgnoreCase("PEPPERONI")
                && !pizzaType.equalsIgnoreCase("SICILIANA")) {
            System.out.println("We cannot cook such pizza");
            return;
        }

        System.out.print("How large (diameter, in cm)? ");
        int pizzaDiameter = scanner.nextInt();

        if (pizzaDiameter < 12 || pizzaDiameter > 36) {
            System.out.println("We only make pizzas between 12 and 36 cm!");
            return;
        }

        price += pizzaDiameter / 12;

        System.out.print("How thick (in cm)? ");
        int pizzaThickness = scanner.nextInt();

        if (pizzaThickness < 1) {
            System.out.println("The pizza is too thin!");
            return;
        } else if (pizzaThickness > 4) {
            System.out.println("The pizza is too thick!");
            return;
        }
        price += pizzaThickness / 2;

        System.out.print("Select topping #1: ");
        String topping1 = scanner.next();

        switch (topping1) {
            case "ketchup":
                price += 0.20;
                break;
            case "mustard":
                price += 0.23;
                break;
            default:
                price += 0.27;
                break;
        }

        System.out.print("Select topping #2: ");
        String topping2 = scanner.next();

        switch (topping2) {
            case "ketchup":
                price += 0.20;
                break;
            case "mustard":
                price += 0.23;
                break;
            default:
                price += 0.27;
                break;
        }

        System.out.print("How many slices? ");

        int slices = scanner.nextInt();

        if (slices < 0) {
            System.out.println("No way to slice the pizza!");
            return;
        } else if (slices == 0) {
            System.out.println("We will not slice the pizza!");
        } else if (slices > 16) {
            System.out.println("We cannot make more than 16 slices!");
            return;
        }

        System.out.printf("You have ordered a %d cm %s pizza, %d cm thick, which has %s and %s. It will be cut in %d slices.\n", pizzaDiameter, pizzaType, pizzaThickness, topping1, topping2, slices);

        double volume = Math.PI * Math.pow(pizzaDiameter / 2, 2) * pizzaThickness;

        System.out.printf("The volume of the pizza with radius %d and height %d is %.2f cm3.\n", pizzaDiameter / 2, pizzaThickness, volume);
        System.out.printf("The final price is %.2f\n", price);
    }
}
