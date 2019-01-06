package bg.unwe;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        array = fillArray(array, size, scanner);
        reverseArray(array, size);
    }

    private static int[] fillArray(int[] array, int size, Scanner scanner) {
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            int currentNumber = scanner.nextInt();
            array[i] = currentNumber;
        }

        return array;
    }

    private static void reverseArray(int[] array, int size) {
        System.out.println("Result: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}