
package codeptit;

import java.util.*;

/**
 *
 * @author Pc
 */
public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int i = 0; i < T; i++) {
            long n = sc.nextLong(); 
            if (isFibonacci(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }   

    private static boolean isFibonacci(long n) {
        // Nếu n là 0 hoặc 1, thì nó là số Fibonacci
        if (n == 0 || n == 1) {
            return true;
        }

        long prev = 0;
        long current = 1;

        // Kiểm tra nếu n thuộc dãy Fibonacci, tức là prev + current == n
        while (prev + current <= n) {
            long next = prev + current;
            prev = current;
            current = next;
            if (current == n) {
                return true;
            }
        }

        // Nếu không thì n không phải số Fibonacci
        return false;
    }
}
