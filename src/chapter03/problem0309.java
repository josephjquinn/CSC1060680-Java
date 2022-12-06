package textbook;

import java.util.Scanner;

public class problem0309
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int original = input.nextInt()   ;
        int number = original;

        int d9 = number%10;
        number = number/=10;
        int d8 = number%10;
        number = number/=10;
        int d7 = number%10;
        number = number/=10;
        int d6 = number%10;
        number = number/=10;
        int d5 = number%10;
        number = number/=10;
        int d4 = number%10;
        number = number/=10;
        int d3 = number%10;
        number = number/=10;
        int d2 = number%10;
        number = number/=10;
        int d1 = number%10;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10)
        {
            System.out.println("The ISBN-10 number is "+ original + "X");

        }
        else
        {
            System.out.println("The ISBN-10 number is "+ original + d10);

        }


    }
}
