/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Pc
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07040 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Set<String> set = new TreeSet<>();
        for (String i : list) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(words));
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (set.contains(s)) {
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}