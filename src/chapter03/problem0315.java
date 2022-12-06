package textbook;

import java.util.*;

public class problem0315
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int lottery = random.nextInt(900) + 100;
        System.out.println(lottery);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int remainingnum = guess;
        int guessd1 = remainingnum%10;
        remainingnum /=10;
        int guessd2 = remainingnum%10;
        remainingnum /=10;
        int guessd3 = remainingnum%10;

        remainingnum = lottery;
        int lotteryd1 = remainingnum%10;
        remainingnum /=10;
        int lotteryd2 = remainingnum%10;
        remainingnum /=10;
        int lotteryd3 = remainingnum%10;


        if (guess == lottery)
        {
            System.out.println("You Win $12,000");

        }
        else if ((guessd1 == lotteryd2) && (guessd2 == lotteryd3) && (guessd3 == lotteryd1) ||
                (guessd1 == lotteryd2) && (guessd2 == lotteryd1) && (guessd3 == lotteryd3) ||
                (guessd1 == lotteryd1) && (guessd2 == lotteryd3) && (guessd3 == lotteryd2) ||
                (guessd1 == lotteryd3) && (guessd2 == lotteryd1) && (guessd3 == lotteryd2) ||
                (guessd1 == lotteryd3) && (guessd2 == lotteryd2) && (guessd3 == lotteryd1))
        {
            System.out.println("You Win $5,000");
        }
        else if ((guessd1 == lotteryd1) || (guessd1 == lotteryd2) || (guessd1 == lotteryd3) ||
                ((guessd2 == lotteryd1) || (guessd2 == lotteryd2) || (guessd2 == lotteryd3)) ||
                ((guessd3 == lotteryd1) || (guessd3 == lotteryd2) || (guessd3 == lotteryd3)))
        {
            System.out.println("You Win $2,0000");
        }
        else
        {
            System.out.println("Sorry no match");
        }


    }
}
