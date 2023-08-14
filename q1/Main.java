/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author Pc
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Phone Book Menu:");
            System.out.println("1. Add new phone number");
            System.out.println("2. Find numbers by area code");
            System.out.println("3. List all phone numbers");
            System.out.println("4. Get total numbers by area code");
            System.out.println("5. Find numbers by suffix");
            System.out.println("6. Sort phone numbers");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter 1 for domestic number or 2 for international number:");
                    int typeChoice = scanner.nextInt();

                    System.out.println("Enter area code:");
                    int areaCode = scanner.nextInt();

                    System.out.println("Enter local number:");
                    int localNumber = scanner.nextInt();

                    if (typeChoice == 1) {
                        PhoneNumber phoneNumber = new PhoneNumber(areaCode, localNumber);
                        phoneBook.addPhoneNumber(phoneNumber);
                    } else if (typeChoice == 2) {
                        System.out.println("Enter country code:");
                        int countryCode = scanner.nextInt();
                        IntlPhoneNumber intlPhoneNumber = new IntlPhoneNumber(countryCode, areaCode, localNumber);
                        phoneBook.addIntlPhoneNumber(intlPhoneNumber);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    System.out.println("Enter area code to find:");
                    int searchAreaCode = scanner.nextInt();
                    ArrayList<PhoneNumber> foundNumbers = phoneBook.findNumbersByAreaCode(searchAreaCode);
                    ArrayList<IntlPhoneNumber> foundIntlNumbers = phoneBook.findIntlNumbersByAreaCode(searchAreaCode);
                    System.out.println("Found domestic numbers:");
                    for (PhoneNumber phoneNumber : foundNumbers) {
                        System.out.println(phoneNumber.getFormattedPhoneNumber());
                    }
                    System.out.println("Found international numbers:");
                    for (IntlPhoneNumber intlPhoneNumber : foundIntlNumbers) {
                        System.out.println(intlPhoneNumber.getFormattedPhoneNumber());
                    }
                    break;
                case 3:
                    phoneBook.listAllPhoneNumbers();
                    break;
                case 4:
                    System.out.println("Enter area code to count:");
                    int countAreaCode = scanner.nextInt();
                    int totalCount = phoneBook.getTotalNumbersByAreaCode(countAreaCode);
                    System.out.println("Total numbers in area code " + countAreaCode + ": " + totalCount);
                    break;
                case 5:
                    System.out.println("Enter the suffix to find:");
                    String suffix = scanner.next();
                    ArrayList<PhoneNumber> foundSuffixNumbers = phoneBook.findNumbersBySuffix(suffix);
                    ArrayList<IntlPhoneNumber> foundSuffixIntlNumbers = phoneBook.findIntlNumbersBySuffix(suffix);
                    System.out.println("Found domestic numbers:");
                    for (PhoneNumber phoneNumber : foundSuffixNumbers) {
                        System.out.println(phoneNumber.getFormattedPhoneNumber());
                    }
                    System.out.println("Found international numbers:");
                    for (IntlPhoneNumber intlPhoneNumber : foundSuffixIntlNumbers) {
                        System.out.println(intlPhoneNumber.getFormattedPhoneNumber());
                    }
                    break;
                case 6:
                    phoneBook.sortPhoneNumbers();
                    System.out.println("Phone numbers sorted successfully!");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
