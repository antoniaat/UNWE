package bg.unwe;

import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of pizza do you want?");
        System.out.println("PEPPERONI, HAWAIIAN, SICILIAN");

        System.out.print("Your choise: ");
        String pizza = scanner.next();

        System.out.print("How large (diameter, in cm)? ");
        int size = scanner.nextInt();

        System.out.print("How thick (in cm)? ");
        int thickness = scanner.nextInt();

        System.out.print("Select topping #1 (ketchup, mustard, mayonnaise, garlic): ");
        String firstTopping = scanner.next();

        System.out.print("Select topping #1 (ketchup, mustard, mayonnaise, garlic): ");
        String secondTopping = scanner.next();

        System.out.print("How many slices? ");
        int slices = scanner.nextInt();

        int radius = size / 2;
        double volume = Math.PI * Math.pow(radius, 2) * thickness;

        System.out.println("You have ordered a " + size + " cm " + pizza + " pizza, " + thickness + " cm thick, which has " + firstTopping + " and " + secondTopping + ". It will be cut in " + slices + " slices. The volume of the pizza with radius " + radius + " and height " + thickness + " is " + volume + " cm3.");
    }
}
