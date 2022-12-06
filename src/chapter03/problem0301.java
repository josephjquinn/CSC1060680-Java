package chapter03;

import java.util.Scanner;

public class problem0301 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double root1 = 0;
        double root2 = 0;

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0)
        {
            root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0)
        {
            root1 = (-b / 2 * a);
            System.out.println("The equation has one root " + root1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }


    }
}
