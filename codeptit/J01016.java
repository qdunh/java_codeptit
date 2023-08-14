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
public class J01016 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) == '4' || s.charAt(i) == '7')
                ++cnt;
        if(cnt == 4 || cnt == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
