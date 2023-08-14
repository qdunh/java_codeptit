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
public class J01018 {
    static String solve(String s)
    {
        int sum = s.charAt(0) - '0';
        for(int i = 1; i < s.length(); ++i)
        {
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2)
                return "NO";
            sum += (s.charAt(i) - '0');
        }
        if(sum % 10 != 0)
            return "NO";
        return "YES";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
