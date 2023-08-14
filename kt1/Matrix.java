/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Matrix {
    private int [][] a;
    
    public Matrix(int r,int c){
        a =new int[r][c];
    }

    public int[][] getMatrix() {
        return a;
    }

    public void setMatrix(int[][] a) {
        this.a = a;
    }
    
    public void input(){
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap ma tran"+a.length+"hang va" +a[0].length+"cot");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
    }
    public void out(){
        System.out.println("Ma tran");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
            
        }

    }
    public void tongHang(){
        int t;
        for (int i = 0; i < a.length; i++) {
            t=0;
            for (int j = 0; j < a[0].length; j++) {
                t+=a[i][j];
                
            }
            System.out.println("Tong hang "+i+": "+t);
            
        }
    }
}
