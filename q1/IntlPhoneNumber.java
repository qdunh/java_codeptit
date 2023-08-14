/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author Pc
 */
public class IntlPhoneNumber extends PhoneNumber {
    private int countryCode;

    public IntlPhoneNumber(int countryCode, int areaCode, int localNumber) {
        super(areaCode, localNumber);
        this.countryCode = countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String getFormattedPhoneNumber() {
        return countryCode + "-" + super.getFormattedPhoneNumber();
    }
}
