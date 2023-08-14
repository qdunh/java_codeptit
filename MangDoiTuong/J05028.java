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

public class J05028 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
        x.isEmpty();
        List<DoanhNghiepTT> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            list.add(DoanhNghiepTT.nextDoanhNghiepTT(sc));
        }
        Collections.sort(list, new Comparator<DoanhNghiepTT>() {
            @Override
            public int compare(DoanhNghiepTT o1, DoanhNghiepTT o2){
                int cmp = (o1.getCount() - o2.getCount());
                if(cmp != 0) 
                    return (int) (o2.getCount() - o1.getCount());
                return (o1.getCode().compareTo(o2.getCode()));
            }
        });
        for (DoanhNghiepTT dn : list) {
            dn.Show();
        }
        sc.close();
    }
}
class DoanhNghiepTT{
    private String code, name;
    private int count;

    public DoanhNghiepTT(){
        this.code = this.name = "";
        this.count = 0;
    }
    public DoanhNghiepTT(String code, String name, int count){
        this.code = code;
        this.name = name;
        this.count = count;
    }

    public int getCount(){
        return count;
    }
    public String getCode(){
        return code;
    }

    public static DoanhNghiepTT nextDoanhNghiepTT(Scanner sc){
        DoanhNghiepTT a = new DoanhNghiepTT();
        a.code = sc.nextLine();
        a.name = sc.nextLine();
        a.count = Integer.valueOf(sc.nextLine());
        return a;
    }

    public void Show(){
        System.out.println(this.code + " " + this.name + " " + this.count);
    }
}