// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Sep 15, 2022
// This program Prompts the user to enter a string, and displays the number of vowels and consonants in the string.

package chapter05;

import java.util.*;

public class problem0549
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        int word_length = word.length();

        String vowels = "aeiou";
        int vcount = 0;
        int ccount = 0;
       for (int count = 0; count < word_length ; count++)
       {
           char letter = word.charAt(count);
           String let = Character.toString(letter);

           if (vowels.contains(let) == true)
           {
               vcount++;
           }
           else if (let.equals(" ") == true)
           {
               continue;
           }
           else
           {
               ccount++;
           }

       }
        System.out.println("The number of vowels is " + vcount);
        System.out.println("The number of consonants is " + ccount);
    }
}
