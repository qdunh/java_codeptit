/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Matrix m=null;
        while(true){
            System.out.println("1.Nhap ma tran");
            System.out.println("2.Viet");
            System.out.println("3.Tong tung hang ");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9. ");
            System.out.println("0. Thoat");
            System.out.print("Chon 0-9: ");
      
            int chon;
            Scanner sc=new Scanner(System.in);
            chon =sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    int r,c;
                    System.out.println("So hang:");
                    r=sc.nextInt();
                    System.out.println("So cot:");
                    c=sc.nextInt();
                    m=new Matrix(r,c);
                    m.input();
                    break;
                case 2:
                    m.out();
                    break;
                case 3:
                    m.tongHang();
                    break;
                default:
                    System.out.println("chon 0-9!");
                    break;
          
            }
            
            
        }
    }
            
}
