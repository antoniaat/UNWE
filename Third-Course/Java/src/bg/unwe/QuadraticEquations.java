package bg.unwe;

public class QuadraticEquations {
    public static void main(String[] args) {
        double a = 3;
        double b = 12.5;
        double c = 9;

        double x1 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        double x2 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
