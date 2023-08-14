/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

public class J03004
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            for (String i : a)
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            System.out.println();
        }
    }
}