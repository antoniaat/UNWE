package bg.unwe;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        BigDecimal firstNum = scanner.nextBigDecimal();

        System.out.print("Second number: ");
        BigDecimal secondNum = scanner.nextBigDecimal();

        System.out.print("First number: ");
        BigDecimal thirdNum = scanner.nextBigDecimal();

        MathContext mc = new MathContext(4); // 3 precision

        BigDecimal average = (firstNum.add(secondNum).add(thirdNum).divide(BigDecimal.valueOf(3)));
        average = average.round(mc);

        DecimalFormat formatter = new DecimalFormat("#,###.0000");

        System.out.println("The average is " + formatter.format(average));
    }
}