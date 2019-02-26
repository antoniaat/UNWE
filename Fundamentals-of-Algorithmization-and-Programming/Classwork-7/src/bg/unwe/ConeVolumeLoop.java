package bg.unwe;

import java.util.Scanner;

public class ConeVolumeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Max Radius: ");
        Integer maxRadius = scanner.nextInt();
        System.out.print("Max Height: ");
        Integer maxHeight = scanner.nextInt();

        for (int radius = 1; radius <= maxRadius; radius++) {
            for (int height = 1; height <= maxHeight; height++) {
                System.out.println("radius " + radius + ", height " + height + ":");
                System.out.println(String.format("volume: %.2f", (Math.PI * radius * radius * height) / 3.0));
            }
        }

        //1 / 3 * pi * r^2 * h
    }
}
