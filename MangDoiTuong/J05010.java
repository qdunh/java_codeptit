/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

/**
 *
 * @author Pc
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05010{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String tm = sc.nextLine();
        int n = Integer.valueOf(tm);
        tm.isEmpty();
        List<MatHang> A = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            A.add(MatHang.nextMatHang(sc, i));
        }
        Collections.sort(A, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                    return (int) ((int)100 * (o2.getLn() - o1.getLn()));
            }
        });

        for (MatHang matHang : A) {
            matHang.Show();
        }
        sc.close();
    }
}
class MatHang{
    private String ma, ten, dv;
    private double gb, gm, ln;

    public MatHang(){
        this.ma = this.ten = this.dv = "";
        this.gb = this.gm = this.ln = 0;
    }

    public MatHang(String ten, String dv, long gm, long gb){
        this.ten = ten;
        this.dv = dv;
        this.gb = gb;
        this.gm = gm;
    }

    public String getMa(){
        return ma;
    }

    public double getLn(){
        return ln;
    }

    public void setMa(int cnt){
        String s = "" + cnt;
        this.ma = s;
    }

    public static MatHang nextMatHang(Scanner sc, int cnt){
        MatHang a = new MatHang();
        a.ten = sc.nextLine();
        a.dv = sc.nextLine();
        a.gm = Double.valueOf(sc.nextLine());
        a.gb = Double.valueOf(sc.nextLine());
        a.ln = a.gb - a.gm;
        a.setMa(cnt);
        return a;
    }
    public void Show(){
        System.out.printf(this.ma + " " + this.ten + " " + this.dv + " ");
        System.out.format("%.2f\n", (double)this.ln);
    }
}