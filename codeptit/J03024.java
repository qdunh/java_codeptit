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
import java.util.Scanner;

public class J03024
{
    static String solve(String s)
    {
        if (s.charAt(0) == '0')
            return "NO";
        int odd = 0;
        for (int i = 0; i < s.length(); ++i)
            odd += s.charAt(i) & 1;
        if ((s.length() & 1) == 1 && odd > s.length() - odd)
            return "YES";
        else if ((s.length() & 1) == 0 && odd < s.length() - odd)
            return "YES";
        return "NO";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine();
            try
            {
                BigInteger a = new BigInteger(s);
                System.out.println(solve(s));
            }
            catch (Exception e)
            {
                System.out.println("INVALID");
            }
        }
    }
}