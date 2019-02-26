package bg.unwe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> allPrices = new ArrayList<Double>();

        System.out.print("How many days? ");
        int days = scanner.nextInt();

        double sum = 0d;

        for (int i = 1; i <= days; i++) {
            System.out.print("Day " + i + ": ");
            double currentPrice = scanner.nextDouble();

            allPrices.add(currentPrice);
            sum += currentPrice;
        }

        System.out.println("Price movements:");

        for (int i = 1; i < allPrices.size(); i++) {
            int currentIndex = i;
            int previousIndex = i - 1;

            double currentChange = allPrices.get(currentIndex) - allPrices.get(previousIndex);

            if (currentChange > 0) {
                System.out.printf("UP with %.4f\n", currentChange);
            } else if (currentChange < 0) {
                currentChange = Math.abs(currentChange);
                System.out.printf("DOWN with %.4f\n", currentChange);
            } else {
                System.out.println("Not changed");
            }
        }

        System.out.printf("Average price for the period %.4f\n", sum / allPrices.size());
    }
}
