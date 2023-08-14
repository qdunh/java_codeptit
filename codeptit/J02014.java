/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Số lượng bộ test

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Số lượng phần tử trong dãy số A[]
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int balancePoint = findBalancePoint(A);
            System.out.println(balancePoint);
        }
    }

    // Hàm tìm điểm cân bằng đầu tiên trong dãy số A[]
    public static int findBalancePoint(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (leftSum == sum - leftSum - A[i]) {
                return i + 1; // Vị trí của điểm cân bằng (chúng ta đánh số từ 1)
            }
            leftSum += A[i];
        }

        return -1; // Không tìm thấy điểm cân bằng, trả về -1
    }    
}
