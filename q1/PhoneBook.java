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

public class PhoneBook {
    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<IntlPhoneNumber> intlPhoneNumbers;

    public PhoneBook() {
        phoneNumbers = new ArrayList<>();
        intlPhoneNumbers = new ArrayList<>();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void addIntlPhoneNumber(IntlPhoneNumber intlPhoneNumber) {
        intlPhoneNumbers.add(intlPhoneNumber);
    }

    public ArrayList<PhoneNumber> findNumbersByAreaCode(int areaCode) {
        ArrayList<PhoneNumber> result = new ArrayList<>();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.getAreaCode() == areaCode) {
                result.add(phoneNumber);
            }
        }
        return result;
    }

    public ArrayList<IntlPhoneNumber> findIntlNumbersByAreaCode(int areaCode) {
        ArrayList<IntlPhoneNumber> result = new ArrayList<>();
        for (IntlPhoneNumber intlPhoneNumber : intlPhoneNumbers) {
            if (intlPhoneNumber.getAreaCode() == areaCode) {
                result.add(intlPhoneNumber);
            }
        }
        return result;
    }

    public void listAllPhoneNumbers() {
        System.out.println("Domestic Phone Numbers:");
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber.getFormattedPhoneNumber());
        }

        System.out.println("International Phone Numbers:");
        for (IntlPhoneNumber intlPhoneNumber : intlPhoneNumbers) {
            System.out.println(intlPhoneNumber.getFormattedPhoneNumber());
        }
    }

    public int getTotalNumbersByAreaCode(int areaCode) {
        int count = 0;
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.getAreaCode() == areaCode) {
                count++;
            }
        }
        for (IntlPhoneNumber intlPhoneNumber : intlPhoneNumbers) {
            if (intlPhoneNumber.getAreaCode() == areaCode) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<PhoneNumber> findNumbersBySuffix(String suffix) {
        ArrayList<PhoneNumber> result = new ArrayList<>();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.getFormattedPhoneNumber().endsWith(suffix)) {
                result.add(phoneNumber);
            }
        }
        return result;
    }

    public ArrayList<IntlPhoneNumber> findIntlNumbersBySuffix(String suffix) {
        ArrayList<IntlPhoneNumber> result = new ArrayList<>();
        for (IntlPhoneNumber intlPhoneNumber : intlPhoneNumbers) {
            if (intlPhoneNumber.getFormattedPhoneNumber().endsWith(suffix)) {
                result.add(intlPhoneNumber);
            }
        }
        return result;
    }

    public void sortPhoneNumbers() {
        phoneNumbers.sort((p1, p2) -> p1.getFormattedPhoneNumber().compareTo(p2.getFormattedPhoneNumber()));
        intlPhoneNumbers.sort((p1, p2) -> p1.getFormattedPhoneNumber().compareTo(p2.getFormattedPhoneNumber()));
    }
}

