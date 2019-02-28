package bg.unwe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter numbers between 1 and 10");

        for (int i = 1; i <= arr.length; i++) {
            System.out.print("Number " + i + ": ");
            int currentNumber = scanner.nextInt();
            arr[i] = currentNumber;
        }

    }

    public static int findMostPopularElement(int[] array) {
        int mostPopularElement = 0;


        return mostPopularElement;
    }
}
