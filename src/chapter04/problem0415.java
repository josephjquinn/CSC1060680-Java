// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Sep 15, 2022
// This program takes a letter input and outputs what that letter would correspond to on an old phonepad.

package chapter04;

import java.util.*;

public class problem0415
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String dial = input.next();

        dial = dial.toLowerCase();
        char let = dial.charAt(0);

        String keypad = "abcdefghijklmnopqrstuvwxyz";
        int pos = keypad.indexOf(let);

        if (dial.length() > 1 || !keypad.contains(dial))
        {
            System.out.println(dial + " is an invalid input");
            System.exit(1);
        }

        switch(pos)
        {
            case 0: case 1: case 2:
               System.out.println("2");
               break;
            case 3: case 4: case 5:
                System.out.println("3");
                break;
            case 6: case 7: case 8:
                System.out.println("4");
                break;
            case 9: case 10: case 11:
                System.out.println("5");
                break;
            case 12: case 13: case 14:
                System.out.println("6");
                break;
            case 15: case 16: case 17: case 18:
                System.out.println("7");
                break;
            case 19: case 20: case 21:
                System.out.println("8");
                break;
            case 22: case 23: case 24: case 25:
                System.out.println("9");
                break;


        }






    }
}
