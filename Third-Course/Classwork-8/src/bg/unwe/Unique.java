package bg.unwe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> allNumbers = new ArrayList<Integer>();

        System.out.print("How many numbers? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            allNumbers.add(scanner.nextInt());
        }

        for (int i = 0; i < allNumbers.size(); i++) {
            int currentNumber = allNumbers.get(i);

            for (int j = i + 1; j < allNumbers.size(); j++) {
                if (currentNumber == allNumbers.get(j) && currentNumber != 0) {
                    System.out.println("Duplicate found!");
                    allNumbers.set(j, 0);
                }
            }
        }

        System.out.println("Final result:");

        String result = "";
        for (int i = 0; i < allNumbers.size(); i++) {
            int currentNum = allNumbers.get(i);

            result += currentNum + " ";
        }

        System.out.println(result);
    }
}
