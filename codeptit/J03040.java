/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Pc
 */
import java.util.*;

public class J03040
{
    private static boolean kiemTraTang(String s)
    {
        for (int i = 1; i < s.length(); ++i)
            if (s.charAt(i) <= s.charAt(i - 1))
                return false;
        return true;
    }

    private static boolean kiemTraGiongnhau(String s)
    {
        for (int i = 1; i < s.length(); ++i)
            if (s.charAt(i) != s.charAt(0))
                return false;
        return true;
    }

    private static boolean kiemTraDauCuoi(String s)
    {
        return kiemTraGiongnhau(s.substring(0, 2)) && kiemTraGiongnhau(s.substring(3));
    }

    private static boolean kiemTraLocPhat(String s)
    {
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().substring(5);
            s = s.substring(0, 3) + s.substring(4);
            if (kiemTraDauCuoi(s) || kiemTraLocPhat(s) || kiemTraGiongnhau(s) || kiemTraTang(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}