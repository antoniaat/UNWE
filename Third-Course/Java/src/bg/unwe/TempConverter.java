package bg.unwe;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit = 98;
        double celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        System.out.println("Temperature in Celsius is: " + celsius);
    }
}