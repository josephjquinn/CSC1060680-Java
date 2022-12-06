package Project;// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Nov 8, 2022
// This program runs a 2 player dice game were the objective is to get to 30 points.
// Each player rolls 2 dice and can choose to either add one of the dice numbers or the total from both.
// You must reach exactly 30, if you go over your score resets to 0.

import java.util.*;

public class FinalProject
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Printing starting information
        System.out.println("*********** WELCOME TO 30 OR BUST ***********");

        System.out.print("ENTER P1: "); // Getting input for both players names
        String player1 = input.nextLine();
        System.out.print("ENTER P2: ");
        String player2 = input.nextLine();

        System.out.println(""); // Printing players names and printing rules
        System.out.println("             ----------" + player1 + " VS " + player2 + "----------");
        System.out.println("");
        System.out.println("In order to win, you need a score of 30. No more, No Less");
        System.out.println("On each of your turns you will roll a sett of dice. You will have the option to add the score of either of the dice to your total ");
        System.out.println("You also have the choice of adding the total from both die to your score");
        System.out.println("This will continue back and forth until one player reaches the golden number 30");
        System.out.println("Oh, and if you go over 30, your score will restart from square 1");
        System.out.println("");
        System.out.println("");
        System.out.println("<><><><><><><><><><><><><<><><><><><><><><>");
        System.out.println("================GAME  START================");
        System.out.println("<><><><><><><><><><><><><<><><><><><><><><>");
        System.out.println(" ");

        int score1 = 0; // setting up score variables
        int score2 = 0;
        Dice dice = new Dice(); // creating dice object
        int turn = 0; // setting up variable to determine turn sequence

        while (true) // Infinite loop to start game logic
        {
            if (turn % 2 == 0) // Determines if turn number is even or odd. If even one player will take a turn and vice versa
            {
                System.out.print("[ " + player1 + " ]");
                System.out.println("  Score: " + score1);
            }
            else
            {
                System.out.print("[ " + player2 + " ]");
                System.out.println("  Score: " + score2);
            }

            dice.rolldice(); // uses dice roll function within the dice object. This will print 2 random numbers between 1-6 and prints what the total would be
            System.out.println("----{1}---------{2}---------{3}-----"); // printing the 3 different options that can be selected through console input
            int choice = input.nextInt();

            if (choice == 1 && turn%2 == 0) // logic to determine which players turn it is through even and odd. And then determines what choice was made through 1-3.
            {
                score1 = score1 + dice.dice1; // based on the choice it will either add one of the dice numbers to the appropriate players score, or add the total to their score. The following else-if statements reflect this.
                System.out.println("Total: " + score1);
            }
            else if (choice == 1 && turn%2 != 0)
            {
                score2 = score2 + dice.dice1;
                System.out.println("Total: " + score2);
            }
            else if (choice == 2 && turn%2 == 0)
            {
                score1 = score1 + dice.dice2;
                System.out.println("Total: " + score1);
                System.out.println("");
            }
            else if (choice == 2 && turn%2 != 0)
            {
                score2 = score2 + dice.total;
                System.out.println("Total: " + score2);
            }
            else if (choice == 3 && turn%2 == 0)
            {
                score1 = score1 + dice.total;
                System.out.println("Total: " + score1);
            }
            else if (choice == 3 && turn%2 != 0)
            {
                score2 = score2 + dice.total;
                System.out.println("Total: " + score2);
            }

            if (score1 == 30) // logic after every round to determine if a player has won
            {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); // printing winning message
                System.out.println("##############" + " PLAYER " + player1 + " WINS!" + "##############");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }
            else if (score2 == 30) // logic after every round to determine if a player has won
            {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); /// printing winning message
                System.out.println("##############" + " PLAYER " + player2 + " WINS! " + "##############");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }

            if (score1 > 30) // logic after every round to determine if a player has gone over the score of 30
            {
                score1 = 0;// resets score to 0
                System.out.println("<<<<<<<<<<<< Score over 30: SCORE RESET >>>>>>>>>>>>");// prints reset message
            }

            if (score2 > 30) // logic after every round to determine if a player has gone over the score of 30
            {
                score2 = 0; // resets score to 0
                System.out.println("<<<<<<<<<<<< Score over 30: SCORE RESET >>>>>>>>>>>>");// prints reset message
            }

            turn++; // adds one to the turn counter. This will alternate from even to odd and change which players turn it is.
            System.out.println("|____________________________________________________________________________|"); // barrier after each rond
        }

    }
}

class Dice
{
    int dice1; // creating dice integer vairables
    int dice2;
    int total;

    Dice()
    {
        dice1 = 0;// constructor method that setts all dice initial value to 0
        dice2 = 0;
        total = 0;
    }

    void rolldice() // Project.Dice function that will generate 2 random numbers 1-6 and print them and their total to the console
    {
        dice1 = (int)( 1 + Math.random() * 6);
        dice2 = (int)( 1 + Math.random() * 6);
        total = dice1+dice2;

        System.out.print("[Die 1: " + dice1 + "]");
        System.out.print("  [Die 2: " + dice2 + "]");
        System.out.println("  [Total: " + total + "]");

    }

}