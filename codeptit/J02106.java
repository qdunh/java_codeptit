
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
public class J02106 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, res = 0;
        for (int i = 0; i < n; ++i)
        {
            int cnt = 0;
            for (int j = 0; j < 3; ++j)
            {
                x = sc.nextInt();
                if (x == 1)
                    ++cnt;
            }
            if (cnt > 1)
                ++res;
        }
        System.out.println(res);
    }
}
