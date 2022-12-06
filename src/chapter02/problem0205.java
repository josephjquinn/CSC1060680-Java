package chapter02;

import java.util.Scanner;

public class problem0205
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble() / 100 ;
        double tip = subtotal * gratuityRate;
        double new_total = tip + subtotal;
        System.out.println("The gratuity is $" + tip + " and the total is $" + new_total );
    }
}
