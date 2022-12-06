package chapter02;

import java.util.Scanner;

public class problem0214
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double kilograms = weight * 0.45359237;
        double meters = height * 0.0254;
        double BMI = kilograms / (meters * meters);
        System.out.println("BMI is " + BMI);
    }
}
