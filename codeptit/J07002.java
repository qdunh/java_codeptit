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
import java.io.IOException;
import java.util.*;

public class J07002
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        String s;
        while (sc.hasNext())
        {
            s = sc.next();
            try
            {
                sum += Integer.parseInt(s);
            }
            catch (Exception e) {}
        }
        System.out.println(sum);
    }
}