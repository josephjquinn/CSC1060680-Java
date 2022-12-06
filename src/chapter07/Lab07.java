// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 10, 2022
// This program

package chapter07;

import java.util.*;

public class Lab07
{
    public static void main(String[] args)
    {
        int[] list = {23, 79, 41, 68, 17, 39, 51, 75, 95, 19};

        System.out.print("Integer values: ");
        for (int e: list)
        {
            System.out.print(e);
            if (e == list[list.length-1])
            {
                break;
            }
            System.out.print(", ");
        }

        int temp = 0;
        int next = 0;
        int key = list[0];
        for (int i = 1; i < list.length; i++)
        {
            temp = list[i];
            if (temp < key)
            {
                key = temp;
            }

        }
        System.out.println("");
        System.out.println("Smallest Integer: " + key);


    }
}
