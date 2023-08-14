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
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {

    private final String msv;
    private String name;

    private final String lop;
    private final String email;

    public Student(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        normalize();
    }

    public String getMsv() {
        return msv;
    }

    private void normalize() {
        String res = "";
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++) {
            res += list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
            if (i != list.length - 1) {
                res += " ";
            }
        }
        name = res;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

    @Override
    public int compareTo(Student o) {
        return msv.compareTo(o.getMsv());
    }
}

public class J07033 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            students[i] = new Student(msv, name, lop, email);
        }
        Arrays.sort(students);
        for (Student i : students) {
            System.out.println(i);
        }
    }
}