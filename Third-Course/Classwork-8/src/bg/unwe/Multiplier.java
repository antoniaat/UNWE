package bg.unwe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> firstArray = new ArrayList<Double>();
        List<Double> secondArray = new ArrayList<Double>();

        System.out.print("Size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("first - " + i + ": ");
            firstArray.add(scanner.nextDouble());
        }

        for (int i = 0; i < size; i++) {
            System.out.print("second - " + i + ": ");
            secondArray.add(scanner.nextDouble());
        }

        for (int i = 0; i < size; i++) {
            double result = firstArray.get(i) * secondArray.get(i);
            System.out.printf("%.2f", result);
        }
    }
}
