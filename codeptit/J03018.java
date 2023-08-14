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

public class J03018
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String n;
        sc.nextLine();
        while(t-- > 0)
        {
            n = sc.nextLine();
            int mod = 0;
            for(int i = 0; i < n.length(); ++i)
                mod = (mod * 10 + n.charAt(i) - '0') % 4;
            if(mod == 0)
                System.out.println(4);
            else
                System.out.println(0);
        }
    }
}