/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

/**
 *
 * @author Pc
 */
import java.util.*;

public class J03007
{
    static String solve(String s)
    {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8')
            return "NO";
        int sum = 0;
        for (int i = 0; i < s.length(); ++i)
            sum += s.charAt(i) - '0';
        String rev = new StringBuilder(s).reverse().toString();
        if (sum % 10 == 0 && s.equals(rev))
            return "YES";
        return "NO";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            System.out.println(solve(sc.nextLine()));
    }
}