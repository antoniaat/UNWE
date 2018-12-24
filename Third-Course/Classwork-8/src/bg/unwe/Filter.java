package bg.unwe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> allNumbers = new ArrayList<Double>();

        System.out.print("How many numbers? ");
        int count = scanner.nextInt();

        System.out.println("Please enter " + count + " numbers:");

        for (int i = 0; i < count; i++) {
            allNumbers.add(scanner.nextDouble());
        }

        System.out.print("Operation (>, < or =): ");
        String operation = scanner.next();

        System.out.print("Than: ");
        double secondNum = scanner.nextDouble();

        for (int i = 0; i < allNumbers.size(); i++) {
            double currentNumber = allNumbers.get(i);

            if (operation.equals("<")) {
                if (currentNumber < secondNum) {
                    System.out.println(currentNumber);
                }
            } else if (operation.equals(">")) {
                if (currentNumber > secondNum) {
                    System.out.println(currentNumber);
                }
            } else if (operation.equals("=")) {
                if (currentNumber == secondNum) {
                    System.out.println(currentNumber);
                }
            }
        }
    }
}