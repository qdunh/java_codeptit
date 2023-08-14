/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author Pc
 */
public class J02013 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            a.add(sc.nextInt());
        for (int i = 0; i < n; ++i)
        {
            boolean notSwap = true;
            for (int j = 0; j < n - i - 1; ++j)
                if (a.get(j) > a.get(j + 1))
                {
                    int tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);
                    notSwap = false;
                }
            if (notSwap)
                break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }    
}
