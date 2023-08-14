/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

import java.util.*;

public class J03005
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;
            for (int i = 1; i < n - 1; ++i)
                System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
            System.out.print(String.valueOf(a[n - 1].charAt(0)).toUpperCase() + a[n - 1].substring(1) + ", ");
            System.out.println(a[0].toUpperCase());
        }
    }
}