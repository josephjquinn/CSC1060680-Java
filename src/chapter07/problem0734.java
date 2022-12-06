// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 11, 2022
// This program contains a method that takes a string input and returns the string sorted in alphabetical order.

package chapter07;

import java.util.*;

public class problem0734
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String user = input.nextLine();
        System.out.println(SortString(user));
    }

    public static String SortString(String word)
    {
        word = word.toLowerCase();
        char[] list = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
        {
            list[i] = word.charAt(i);
        }

        char[] sort = new char[word.length()];



        for (int u = 0; u < list.length; u++)
        {
            int key = list[0];
            int pos = 0;
            for (int i = 1; i < list.length; i++)
            {
                if ((int)list[i] < (int)key)
                {
                    key = list[i];
                    pos = i;
                }
            }
            sort[u] = (char)key;
            list[pos] = (char)126;
        }

        String total = "";
        for (char e: sort)
        {
            total = total + e;
        }
        return total;
    }
}
