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
public class J01008 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; ++i)
        {
            System.out.print("Test " + i + ": ");
            int n = sc.nextInt();
            for(int j = 2; j <= Math.sqrt(n); ++j)
            {
                if(n % j == 0)
                {
                    int cnt = 0;
                    while(n % j == 0)
                    {
                        ++cnt;
                        n /= j;
                    }
                    System.out.print(j + "(" + cnt + ") ");
                }
            }
            if(n > 1)
                System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
