/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptitv3;

/**
 *
 * @author Pc
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class J07011 {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String x = sc.nextLine();
        int t = Integer.valueOf(x);
        x.isEmpty();
        String s = "";
        while(t--> 0){
            String a = sc.nextLine();
            a = a.toLowerCase();
            s += (a + " ");
        }
        s = s.substring(0, s.length() - 1);
        String res = "";
        String [] array = s.split(" ");
        for(int i = 0; i < array.length; ++i){
            res += isWord(array[i]) + " ";
        }
        List<Word> list = new ArrayList<>();
        Vector<String> v = Convert(res);
        for (String str: v) {
            list.add(new Word(str));
        }
        for(int i = 0; i < list.size(); ++i){
            if(list.get(i).getVs() == false){
                int cnt = list.get(i).getCount();
                for(int j = i + 1; j < list.size(); ++j){
                    if(list.get(j).getVs() == false && list.get(i).getWord().compareTo(list.get(j).getWord()) == 0){
                        list.get(j).setVS(true);
                        cnt += list.get(j).getCount();
                    }
                }
                list.get(i).setCount(cnt);
            }
        }
        List<Word> result = new ArrayList<>();
        for (Word word : list) {
            if(word.getWord().length() > 0){
                result.add(word);
            }
        }
        Collections.sort(result);
        for (Word word : result) {
            if(word.getVs() == false){
                System.out.println(word);
            }
        }
        sc.close();
    }

    public static String isWord(String s){
        String [] c = {",", ".", "?", "!", ":", ";", "(", ")", "/", "-"};
        for(int i = 0; i < 10; ++i){
            while(s.contains(c[i])){
                s = s.replace(c[i], " ");
            }
        }
        return s;
    }

    public static Vector<String> Convert(String s){
        Vector<String> res = new Vector<>();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && tmp.length() > 0) {
                tmp = tmp.toLowerCase();
                res.add(tmp);
                tmp = "";
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) >= '0' && s.charAt(i) <= '9')
                tmp += s.charAt(i);
        }
        return res;
    }
}

class Word implements Comparable<Word>{
    private String word;
    private int count;
    private boolean vs;

    public Word(){
        this.word = "";
        this.count = 0;
        this.vs = false;
    }

    public Word(String str){
        this.word = str;
        this.count = 1;
        this.vs = false;
    }

    public void setVS(boolean value){
        this.vs = value;
    }
    public void setCount(int cnt){
        this.count = cnt;
    }

    public String getWord(){
        return word;
    }
    public int getCount(){
        return count;
    }
    public boolean getVs(){
        return vs;
    }
    
    @Override
    public String toString(){
        return word + " " + count;
    }

    @Override
    public int compareTo(Word o) {
        if(o.getCount() != this.getCount())
            return (int)(o.getCount() - this.getCount());
        return this.getWord().compareTo(o.getWord());
    }
}