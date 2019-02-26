package bg.unwe;

public class TimeCalculator {
    public static void main(String[] args) {
        double seconds = 1540800;

        double minutes = seconds / 60;
        double hours = minutes / 60;
        double days = hours  / 24;
        double weeks = days / 7;
        double years = days / 365;

        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
        System.out.println("Weeks: " + weeks);
        System.out.println("Years: " + years);
    }
}
