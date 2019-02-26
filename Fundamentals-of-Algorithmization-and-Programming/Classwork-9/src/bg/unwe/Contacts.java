package bg.unwe;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<String, String>();

        System.out.print("How many contacts do you have? ");
        int contactsCount = scanner.nextInt();

        for (int i = 1; i <= contactsCount; i++) {
            System.out.println("Enter contact " + i + ":");
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Phone: ");
            String phone = scanner.next();

            if (phone.length() != 10) {
                i--;
                continue;
            }

            contacts.put(name, phone);
        }

        System.out.print("Search by name: ");
        String searchedName = scanner.next();

        searchUser(contacts, searchedName);
    }

    public static void searchUser(HashMap<String, String> contacts, String searchedName) {
        boolean hasFound = false;

        for (String key : contacts.keySet()) {
            String value = contacts.get(key);

            String searchedNameToLowerCase = searchedName.toLowerCase();
            String currentNameToLowerCase = key.toLowerCase();

            if (searchedNameToLowerCase.equals(currentNameToLowerCase)) {
                hasFound = true;
                System.out.println("Found: " + value);
            }
        }

        if (!hasFound) {
            System.out.println("Not found.");
        }
    }
}