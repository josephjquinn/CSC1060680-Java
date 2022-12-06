// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 4, 2022
// This program

package chapter06;

import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.text.DecimalFormat;


public class Lab06

{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        displayHeader();
        String sum = displayBody();
        displayFooter(sum);
    }

    public static void displayHeader()
    {
        System.out.println("Name..........Amount");
    }

    public static void displayFooter(String total)
    {
        System.out.println("Total......" + total);
    }

    public static String displayBody()
            throws FileNotFoundException
    {
        File file = new File("C:\\Users\\Joseph\\IdeaProjects\\JavaTextbook\\src\\chapter06\\Lab06Data.txt");
        Scanner input = new Scanner(file);
        input.useDelimiter("\\Z");

        int total = 0;
        while (input.hasNextLine())
        {
            String name = input.nextLine();
            if (name.equals("quit"))
            {
                break;
            }
            if (name.equals(""))
            {
                continue;
            }
            String gap = input.nextLine();
            int amount = Integer.parseInt(input.nextLine());
            total = total + amount;

            int x = name.length();
            int z = 12 - x;
            String y = ".".repeat(z);

            String format1 = "#,###";

            DecimalFormat DecimalFormatObject = new DecimalFormat(format1);

            double format_1 = amount;
            double format_2 = total;

            System.out.println(name+ y + DecimalFormatObject.format(format_1));

        }

        String format1 = "#,###";
        double format_2 = total;
        DecimalFormat DecimalFormatObject = new DecimalFormat(format1);
        String T  = DecimalFormatObject.format(format_2);
        return T;
    }

}
