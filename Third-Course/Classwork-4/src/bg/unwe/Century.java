package bg.unwe;

import java.util.Date;
import java.util.Scanner;

public class Century {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year <= 1901) {
            System.out.println("Before 20th century");
        } else if (year >= 2000) {
            System.out.println("After 20th century");
        } else {
            System.out.println("During 20th century");
        }
    }
}
