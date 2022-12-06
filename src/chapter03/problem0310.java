package chapter03;

import java.util.Scanner;

public class problem0310
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        System.out.println("What is " + num1 + " * " + num2 + "?");
        int guess = input.nextInt();
        boolean ans = (guess == num1*num2);

        if (ans == true)
        {
            System.out.println("You are correct!");
        }
        else
        {
            System.out.println("Your answer is wrong");
            System.out.println(num1 + " * " + num2  + " should be " + (num1*num2));
        }


    }
}
