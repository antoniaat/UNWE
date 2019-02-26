package bg.unwe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTimeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Date and time: ");
        String input = scanner.nextLine();

        dateIsValid(input);
    }

    private static void dateIsValid(String input) {
        boolean isValid = true;

        final String regex = "([0-9]+)";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);

        int year = 0, month = 0, day = 0, hour = 0, minutes = 0, index = 0;

        while (matcher.find()) {
            index++;

            int currentNum = Integer.parseInt(matcher.group(1));

            if (index == 1) {
                year = currentNum;
            } else if (index == 2) {
                if (currentNum >= 1 && currentNum <= 12) {
                    month = currentNum;
                } else {
                    printErrorMessage("month");
                    isValid = false;
                    break;
                }
            } else if (index == 3) {
                if (currentNum >= 1 && currentNum <= 31) {
                    day = currentNum;
                } else {
                    printErrorMessage("day");
                    isValid = false;
                    break;
                }
            } else if (index == 4) {
                if (currentNum >= 0 && currentNum <= 23) {
                    hour = currentNum;
                } else {
                    printErrorMessage("hour");
                    isValid = false;
                    break;
                }
            } else if (index == 5) {
                if (currentNum >= 0 && currentNum <= 59) {
                    minutes = currentNum;
                } else {
                    printErrorMessage("minutes");
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            printData(year, month, day, hour, minutes);
        }
    }

    private static void printData(int year, int month, int day, int hour, int minutes) {
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minutes: " + minutes);
    }

    private static void printErrorMessage(String message) {
        System.out.println("Invalid " + message);
    }
}
