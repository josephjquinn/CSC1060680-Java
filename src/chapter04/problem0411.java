// Joseph Quinn
// CSC 119 Intro to Programming, section 380
// Sep 13, 2022
// Program that prompts the user to enter binary digits and displays its corresponding decimal value.

import java.util.*;

public class problem0411
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binary = input.next();
        int pos1 = Integer.parseInt(String.valueOf((binary.charAt(0))));
        int pos2 = Integer.parseInt(String.valueOf((binary.charAt(1))));
        int pos3 = Integer.parseInt(String.valueOf((binary.charAt(2))));
        int pos4 = Integer.parseInt(String.valueOf((binary.charAt(3))));

        int value1 = pos1*8;
        int value2 = pos2*4;
        int value3 = pos3*2;
        int value4 = pos4*1;

        int total = value1 + value2 + value3 + value4;

        System.out.println("The decimal value is " + total);
    }
}
