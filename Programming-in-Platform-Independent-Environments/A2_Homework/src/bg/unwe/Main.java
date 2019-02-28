package bg.unwe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 1; i <= array.length; i++) {
            System.out.print("Number " + i + " = ");
            array[i] = scanner.nextInt();
        }

        String command = scanner.next();

        int result = 0;

        if (command.equals("m")) {
            result = calculateAddition(array);
        } else if (command.equals("a")) {
            result = calculateMultiplication(array);
        }

        System.out.println("Result = " + result);
    }

    public static int calculateAddition(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static int calculateMultiplication(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }

        return result;
    }
}
