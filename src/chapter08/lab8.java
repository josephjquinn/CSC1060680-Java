// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 20, 2022
// This program reads a file with 5 4x4 number grids with numbers. It then runs it through a method that converts
// this string into a 3D int array. Then it uses another method to  check each dimension of this array to determine
// if each of the grids are a magic square or not.

package chapter08;

import java.util.*;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.io.File;

public class lab8
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        int[][][] data = readtxt();
        int[] ans = checksquare(data);

        for (int array_num =0; array_num < 5; array_num++)
        {
            for (int list_num = 0; list_num < 4; list_num++)
            {
                System.out.println(" ");
                for (int count =0; count < 4; count++)
                {
                    System.out.print(data[array_num][list_num][count]);
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            if (ans[array_num] == 1)
            {
                System.out.println("NOT a magic square");
            }
            else
            {
                System.out.println("IS a magic square");
            }
        }
    }

    public static int[][][] readtxt()
            throws FileNotFoundException
    {
        File file = new File("C:\\Users\\Joseph\\IdeaProjects\\JavaTextbook\\src\\chapter08\\lab8data.txt");
        Scanner input = new Scanner(file);
        input.useDelimiter("\\Z");

        int[][][] data = new int[5][4][4];

        int count = 0;
        int array_count = 0;
        int line_count = 0;
        while (input.hasNextLine())
        {
            count++;

            String line = input.nextLine();
            String temp[] = line.split(" ");
            if (line.contains("-999"))
            {
                break;
            }

            for(int i =0; i < temp.length; i++)
            {
                int x = Integer.parseInt(temp[i]);
                //System.out.println(x);
                data[array_count][line_count][i] = x;
            }

            line_count++;

            if (count % 4 == 0)
            {
                array_count++;
                line_count = 0;
            }
        }
       return data;
    }

    public static int[] checksquare(int[][][] data)
    {
        int[][][] square = data;
        boolean magic = false;
        int key = 0;
        int temp =0;
        int val1 = 0;
        int val2 = 0;
        int[] ans = new int[5];

        for(int array_num =0; array_num < 5; array_num++)
        {
            for (int dia = 0; dia < 4; dia++)
            {
                val1 = val1 + square[array_num][dia][dia];
            }

            for (int dia2 = 3; dia2 > 0; dia2--)
            {
                val2 = val2 + square[array_num][dia2][dia2];
            }
            if (val2 != val1)
            {
                ans[array_num] = 1;
                temp = 0;
                break;
            }
            temp = 0;

        }

        for(int array_num =0; array_num < 5; array_num++)
        {
            for(int counter = 0; counter < 4; counter++)
            {
                key = key + square[array_num][0][counter];
            }
            //System.out.println(key);

            for(int row_num = 0; row_num < 4; row_num++)
            {
                for(int count = 0; count < 4; count++)
                {
                    temp = temp + square[array_num][row_num][count];
                    //System.out.println(temp+" "+square[array_num][row_num][count]);
                }

                if (temp != key)
                {
                    ans[array_num] = 1;
                    temp = 0;
                    break;
                }
                temp = 0;
            }

            for(int collum_num = 0; collum_num < 4; collum_num++)
            {
                for(int count = 0; count < 4; count++)
                {
                    temp = temp + square[array_num][count][collum_num];
                    //System.out.println(temp+" "+square[array_num][count][collum_num]);
                }

                if (temp != key)
                {
                    ans[array_num] = 1;
                    temp = 0;
                    break;
                }
                temp = 0;
            }

            key = 0;
        }
        return ans;

    }

}
