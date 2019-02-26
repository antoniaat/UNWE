package bg.unwe;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount;
        String from, to;

        double usdToBgn = 1.72;
        double euroToBgn = 1.9558;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        amount = scanner.nextDouble();

        System.out.print("From: ");
        from = scanner.next();

        System.out.print("To: ");
        to = scanner.next();

        double result = 0;

        if (from.equals(to)) {
            result = amount;
        } else if (from.equals("USD") && to.equals("BGN")) {
            result = amount * usdToBgn;
        } else if (from.equals("USD") && to.equals("EUR")) {
            result = amount * usdToBgn / euroToBgn;
        } else if (from.equals("BGN") && to.equals("USD")) {
            result = amount / usdToBgn;
        } else if (from.equals("BGN") && to.equals("EUR")) {
            result = amount / euroToBgn;
        } else if (from.equals("EUR") && to.equals("BGN")) {
            result = amount * euroToBgn;
        } else if (from.equals("EUR") && to.equals("USD")) {
            result = amount * euroToBgn / usdToBgn;
        } else {
            System.out.println("Unknown conversion");
            return;
        }

        System.out.printf("Result: %.4f\n", result);
    }
}
