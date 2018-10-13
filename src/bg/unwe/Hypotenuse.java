package bg.unwe;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        a = 3;
        b = 4;

        c = Math.sqrt(a * a + b * b);
        System.out.println("The lenght of the hypotenuse is " + c);
    }
}
