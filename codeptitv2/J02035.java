/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptitv2;

/**
 *
 * @author Pc
 */
import java.util.Scanner;

public class J02035 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; ++i) a[i] = ip.nextInt();
            System.out.println(Check(a, n));

        }
        ip.close();
    }
    public static int Check(int [] a, int n){
        for(int i = 0; i < n - 1; ++i){
            if(a[i] > a[i + 1])
                return i + 1;
        }
        return 0;
    }
}