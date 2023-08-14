/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Pc
 */
import java.math.BigInteger;
import java.util.*;

public class J03013
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String s = String.valueOf(a.subtract(b).abs());
            int max = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while (s.length() < max)
                s = "0" + s;
            System.out.println(s);
        }
    }
}