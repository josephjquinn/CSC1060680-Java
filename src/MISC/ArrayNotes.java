// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Sep 15, 2022
// This program

package MISC;

import java.util.*;

public class ArrayNotes
{
    public static void main(String[] args)
    {
        //How create arrays
        int[] list1 = new int[3];
        list1[0] = 5;
        list1[1] = 7;
        list1[2] = 9;

        //More streamlined way to create arrays
        int[] list2 = {2, 4 ,6};

        //Foreach Loops
        for (int e: list2)
        {
            System.out.println(e);
        }



        //2D array
        int[][] matrix;
        matrix = new int[2][2];
        matrix[0][0] = 2;
        matrix[0][1] = 4;
        matrix[1][0] = 6;
        matrix[1][1] = 8;


        //2D array streamlined method
        int[][] matrix2 = {
                {1,2,3},
                {3,5,6},
                {7,8,9}
        };

        System.out.println(matrix2[2][1]);

    }

}
