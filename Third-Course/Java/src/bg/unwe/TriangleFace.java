package bg.unwe;

public class TriangleFace {
    public static void main(String[] args) {
        int a = 7;
        double c = 18.4;

        double b = Math.sqrt(c * c - a * a);
        double face = (a * b) / 2;

        System.out.println("The face of the triangle is " + face);
    }
}
