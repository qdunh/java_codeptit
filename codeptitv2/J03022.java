/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptitv2;

/**
 *
 * @author Pc
 */
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Xu ly van ban
public class J03022 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "";
        ArrayList<String> S = new ArrayList<>();
        while(scan.hasNext()){
            String s = scan.next();
            if(s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '?') {
                a += s.substring(0,s.length() - 1);
                S.add(a.trim().toLowerCase(Locale.ROOT));
                a = "";
            }
            else a += s + " ";
            if(s.isEmpty())
                break;

        }
        for(String x: S) {
            for(int i = 0;i < x.length(); i++)
                if(i == 0) 
                    System.out.print((char)(x.charAt(i) - 32));
            else 
                System.out.print(x.charAt(i));
            System.out.println();
        }
        scan.close();
    }
}