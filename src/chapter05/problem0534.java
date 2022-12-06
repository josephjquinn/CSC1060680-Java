// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Sep 15, 2022
// This program that plays the popular scissor–rock– paper game.
// (Scissors can cut paper, rock can knock scissors, and a paper can
//wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
//scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
//2 and displays a message indicating whether the user or the computer wins, loses, or draws.
// Lets the user continuously play until either the user or the computer wins three times more than their opponent.

package chapter05;

import java.util.*;

public class problem0534
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String game_computer = "";
        String game_user = "";
        int count = 0;
        int computer_score = 0;
        int user_score = 0;


        while (computer_score < 3 && user_score < 3)
        {
            System.out.print("scissor (0), rock (1), paper (2): ");
            int selection = input.nextInt();
            int computer = (int)(Math.random() * 3);




            switch (computer)
            {
                case 0:
                    game_computer = "scissors"; break;
                case 1:
                    game_computer = "rock"; break;
                case 2:
                    game_computer = "paper"; break;

            }

            switch (selection)
            {
                case 0:
                    game_user = "scissors"; break;
                case 1:
                    game_user = "rock"; break;
                case 2:
                    game_user = "paper"; break;

            }

            int score = selection - computer;
            int result = 0;

            switch (score)
            {
                case 1:
                    result = 1; break;
                case -2:
                    result = 1; break;
                case 0:
                    result = 2; break;
                default:
                    result = 3; break;

            }

            switch (result)
            {
                case 1:
                    user_score++;
                    System.out.println("The computer is " + game_computer + " and you are " + game_user + ". You won. The score is You: " + user_score + " Computer: " + computer_score); break;
                case 2:
                    System.out.println("The computer is " + game_computer + " and you are " + game_user + ". It is a draw. The score is You: " + user_score + " Computer: " + computer_score); break;
                case 3:
                    computer_score++;
                    System.out.println("The computer is " + game_computer + " and you are " + game_user + ". You lost. The score is You: " + user_score + " Computer: " + computer_score); break;
            }


        }
System.out.println("GAME OVER");




    }
}
