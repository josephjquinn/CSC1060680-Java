// Joseph Quinn
// CSC 119 Intro to Programming, section 380
// Sep 13, 2022
// Assume that a vehicle plate number consists of
// three uppercase letters followed by four digits. Write a program to generate a plate number.

import java.util.*;

public class problem0425
{
    public static void main(String[] args)
    {
        int n1 = (int)(Math.random() * 9);
        int n2 = (int)(Math.random() * 9);
        int n3 = (int)(Math.random() * 9);
        int n4 = (int)(Math.random() * 9);

        char l1 = (char)(65 + (int)(Math.random() * 25));
        char l2 = (char)(65 + (int)(Math.random() * 25));
        char l3 = (char)(65 + (int)(Math.random() * 25));
        System.out.println(l1+""+l2+""+""+l3+""+n1+""+n2+""+n3+""+n4);
    }
}