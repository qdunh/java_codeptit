/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

/**
 *
 * @author Pc
 */
import java.math.BigInteger;
import java.util.*;

public class J03033
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String a, b;
        while(t-- > 0)
        {
            a = sc.nextLine();
            b = sc.nextLine();
            BigInteger x, y;
            x = new BigInteger(a, 10);
            y = new BigInteger(b, 10);
            BigInteger GCD = x.gcd(y);
            x = x.multiply(y);
            GCD = x.divide(GCD);
            System.out.println(GCD);
        }
    }
}