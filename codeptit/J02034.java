/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

public class J02034
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i)
            a.add(sc.nextInt());
        if (a.size() == n && a.get(n - 1) == n)
            System.out.println("Excellent!");
        else
        {
            boolean[] f = new boolean[a.get(n - 1) + 5];
            for (int i : a)
                f[i] = true;
            for (int i = 1; i <= a.get(n - 1); ++i)
                if (!f[i])
                    System.out.println(i);
        }
    }
}