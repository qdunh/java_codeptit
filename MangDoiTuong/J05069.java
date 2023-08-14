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
import java.util.List;
import java.util.Scanner;

public class J05069 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
        x.isEmpty();
        List<Club> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i) 
            list.add(Club.nextClub(sc));
        x = sc.nextLine();
        int q = Integer.valueOf(x);
        x.isEmpty();
        while(q-- > 0){
            String s = sc.next();
            long count = Long.valueOf(sc.next());
            for (Club club : list) {
                if(s.substring(1, 3).compareTo(club.getCode()) == 0){
                    club.SetMatch(s, count);
                    System.out.println(club);
                }
            }
        }
    }
}
class Club{
    private String name, code, codeMatch;
    private int costofTicket;
    private long total;

    public Club(){
        this.name = this.code = "";
        this.costofTicket = 0;
        this.total = 0;
    }
    public Club(String code, String name, int costofTicket){
        this.code = code;
        this.name = name;
        this.costofTicket = costofTicket;
    }

    public static Club nextClub(Scanner sc){
        return new Club(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()));
    }

    public void SetMatch(String s, long count){
        this.codeMatch = s;
        this.total = count * this.costofTicket;
    }

    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getCostofTicket(){
        return costofTicket;
    }
    public long getTotal(){
        return total;
    }

    @Override
    public String toString(){
        return codeMatch + " " + name + " " + total;
    }

}