// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 18, 2022
// Nine coins are placed in a 3-by-3 matrix with some
//face up and some face down. You can represent the state of the coins using a
//3-by-3 matrix with values 0 (heads) and 1 (tails). This program takes a number input and returns what that combination
// would be in terms of H and T in the matrix.

package chapter08;

import java.util.*;

public class problem0811
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = input.nextInt();

        int[] binary = new int[9];
        int pos = 0;

        while(num > 0)
        {
            binary[(8-(pos++))] = num % 2;
            num = num / 2;
        }

        char[] let = new char[9];

        for(int i = 0; i < 9; i++)
        {
            if (binary[i] == 1)
            {
                let[i] = 'T';
            }
            else
            {
               let[i] = 'H';
            }
        }

        char[][] coin = new char [3][3];
        coin[0][0] = let[0]; coin[0][1] = let[1]; coin[0][2] = let[2];
        coin[1][0] = let[3]; coin[1][1] = let[4]; coin[1][2] = let[5];
        coin[2][0] = let[6]; coin[2][1] = let[7]; coin[2][2] = let[8];

        for (int row = 0; row < coin.length; row++) {
            for (int column = 0; column < coin[row].length; column++) {
                System.out.print(coin[row][column] + " ");
            }
            System.out.println();
        }

    }
}
