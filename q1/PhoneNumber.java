/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author Pc
 */
public class PhoneNumber {
    private int areaCode;
    private int localNumber;

    public PhoneNumber(int areaCode, int localNumber) {
        this.areaCode = areaCode;
        this.localNumber = localNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(int localNumber) {
        this.localNumber = localNumber;
    }

    public String getFormattedPhoneNumber() {
        String areaCodeString = String.valueOf(areaCode);
        String localNumberString = String.valueOf(localNumber);
        if (areaCodeString.length() == 3) {
            areaCodeString = "0" + areaCodeString;
        }
        return areaCodeString + "-" + localNumberString;
    }
}
