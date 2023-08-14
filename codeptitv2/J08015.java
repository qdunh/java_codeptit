/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptitv2;

/**
 *
 * @author Pc
 */
import java.util.Arrays;
import java.util.Scanner;
 
public class J08015 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(long i = 0; i < t; i++){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long [] a = new long[n];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextLong();
            }
            Arrays.sort(a);
 
            long ans = 0;
            for (int j = 0; j < n - 1; j++){
                long up = upper_bound(a, j + 1, n - 1, k - a[j]);
                long dow = lower_boud(a, j + 1, n - 1 , k - a[j]);
                if(dow <= n - 1)ans += up - dow + 1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
    public static long lower_boud(long []a, int l, int r, long x){
 
        long ans = r + 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] == x){
                ans = m;
                r = m - 1;
            }
            else if(a[m] >= x){
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }
    public static long upper_bound(long []a, int l, int r, long x){
 
        long ans = r + 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] == x){
                ans = m;
                l = m + 1;
 
            }
            else if(a[m] >= x){
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }
 
}