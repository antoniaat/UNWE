package bg.unwe;

import java.math.BigDecimal;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNum = scanner.nextInt();

        System.out.print("Third number: ");
        int thirdNum = scanner.nextInt();

        System.out.print("Fourth number: ");
        int fourthNum = scanner.nextInt();

        int averageInt = (firstNum + secondNum + thirdNum + fourthNum) / 4;

//      BigDecimal averageDouble = BigDecimal.valueOf(firstNum + secondNum + thirdNum + fourthNum).divide(BigDecimal.valueOf(4L));

        double averageDouble = (firstNum + secondNum + thirdNum + fourthNum) / 4D;

        if((firstNum <= 0 || firstNum >= 127)
                || (secondNum <= 0 || secondNum >= 127)
                || (thirdNum <= 0 || thirdNum >= 127)
                || (fourthNum <= 0 || fourthNum >= 127)) return;

        System.out.println("The average, calculated with whole number division is " + averageInt + ".");
        System.out.println(String.format("The average, calculated with decimal number division is %.2f", averageDouble));
    }
}
