package chapter02;

import java.util.Scanner;

public class problem0206
{
    public static void main(String[] args)
    {
        System.out.print("Enter an integer between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int initialNumber = num;

        if (num > 1000)
        {
            System.out.println("Number too large!");
        }
        else
        {
            int total = 1;
            while (num % 10 != 0)
            {
                total = total * (num % 10);
                num = num / 10;
            }

            System.out.println("The multiplication of all the digits in the number " + initialNumber + " is " + total);
        }






    }
}
