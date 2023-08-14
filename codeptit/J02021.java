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
public class J02021 {

    static int n, k;
    static int cnt = 0;

    static void Try(int i, String s)
    {
        if (s.length() == k)
        {
            System.out.print(s + " ");
            ++cnt;
            return;
        }
        for (int j = i; j <= n; ++j)
            Try(j + 1, s + Integer.toString(j));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1, "");
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
