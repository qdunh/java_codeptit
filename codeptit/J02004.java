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
public class J02004 {


    static String solve(int n, int a[])
    {
        for(int i = 0; i < n / 2; ++i)
            if(a[i] != a[n - i - 1])
                return "NO";
        return "YES";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0)
        {
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i)
                a[i] = sc.nextInt();
            System.out.println(solve(n, a));
        }
    }
}
