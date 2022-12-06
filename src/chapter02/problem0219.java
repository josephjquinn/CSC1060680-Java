package chapter02;

import java.util.Scanner;

public class problem0219
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side_1 = Math.pow((Math.pow((x1-x2), 2)) + (Math.pow((y1-y2), 2)), 0.5);
        double side_2 = Math.pow((Math.pow((x2-x3), 2)) + (Math.pow((y2-y3), 2)), 0.5);
        double side_3 = Math.pow((Math.pow((x1-x3), 2)) + (Math.pow((y1-y3), 2)), 0.5);
        double s = (side_1 + side_2 + side_3) / 2;

        double area = Math.pow(s * (s - side_1) * (s - side_2) * (s - side_3), 0.5);
        System.out.println("The area of the triangle is " + area);
    }

}
