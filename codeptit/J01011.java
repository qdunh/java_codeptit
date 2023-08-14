/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class J01011 {

    static long gcd(long a, long b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long a = sc.nextLong(), b = sc.nextLong();
            long GCD = gcd(a, b);
            System.out.println(a * b / GCD + " " + GCD);
        }
    }
}
