package bg.unwe;

import java.util.Scanner;

public class SaladMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many tomato slices do you want? ");
        int tomatoSlices = scanner.nextInt();

//        int tomatoSlices = 8;

        System.out.print("How many cucumber slices do you want? ");
        int cucumberSlices = scanner.nextInt();
//        int cucumberSlices = 6;

        System.out.print("How much olive oil do you want? (in ml) ");
        double oliveOil = scanner.nextDouble();
//        double oliveOil = 15;

        System.out.print("How much salt do you want? (in g) ");
        double salt = scanner.nextInt();
//        int salt = 2;

        double weight = (tomatoSlices * 30) + (cucumberSlices * 14) + (oliveOil * 1.2);

        System.out.println("The salad contains " + tomatoSlices + " tomato slices, " + cucumberSlices + " cucumber slices, " + oliveOil + "ml olive oil and " + salt + "mg salt. The weight is " + weight);

        System.out.print("What is the target weight of the salad? ");
        double targetWeight = scanner.nextDouble();
//        double targetWeight = 400;

        double diffBetweenWeights = targetWeight - weight;

        int countOfTomatoes = (int) Math.floor(diffBetweenWeights / 30);

        int countCucumbers = (int) Math.floor(diffBetweenWeights / 14);

        System.out.println("You should put " + countOfTomatoes + " slices of tomato or " + countCucumbers + " slices of cucumber in the salad to reach the target weight of " + targetWeight + " g.");
    }
}
