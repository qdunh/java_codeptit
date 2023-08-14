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

public class J03025
{
    static String solve(String s)
    {
        int len = s.length();
        int cnt = 0;
        for (int i = 0; i < len / 2 && cnt <= 1; ++i)
            if (s.charAt(i) != s.charAt(len - i - 1))
                ++cnt;
        if ((len & 1) == 1 && cnt <= 1)
            return "YES";
        else if ((len & 1) == 0 && cnt == 1)
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