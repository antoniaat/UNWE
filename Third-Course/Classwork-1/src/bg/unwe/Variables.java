package bg.unwe;

public class Variables {
    public static void main(String[] args) {
        boolean agreed = true;
        System.out.println("Agreed: " + agreed);

        byte personAge = 20;
        System.out.println("Age: " + personAge);

        short money = 31500;
        System.out.printf("Money: " + money);

        int minutesSinceBirth = 16720000;
        System.out.println("Minutes since birth: " + minutesSinceBirth);

        long numberOfCells = 37_200_000_000_000L;
        System.out.println("Number of cells in a human body: " + numberOfCells);

        float water = 1.85f;
        System.out.println("I have " +  water + " liters of water");

        double sunTemperature = 15000000.1;
        System.out.println("Sun's temperature is: " + sunTemperature);

        char gender = 'M';
        System.out.println("The person's gender is: " + gender);

        String myName = "Tyrion";
        System.out.println("My name is: " + myName);
    }
}
