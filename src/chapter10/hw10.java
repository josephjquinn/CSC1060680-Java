// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Nov 6, 2022
// This program adjusts the warrior fred java class and creates a game that makes an array of warrior objects and lasts 10 rounds randomly assigning damage. Then prints out all 5 warriors status.

package chapter10;

import java.util.Random;

public class hw10
{
    public static void main(String[] args)
    {
        WarriorFred army[] = new WarriorFred[5];
        for (int i = 0; i <5; i++)
        {
            army[i] = new WarriorFred();
        }
        army[0].setNickName("billy");
        army[1].setNickName("rodger");
        army[2].setNickName("kyle");
        army[3].setNickName("josh");
        army[4].setNickName("doug");



        System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
        for (int round = 0; round < 11; round++)
        {
            System.out.println("               Round " + (round));

            for (int c = 0; c < 5; c++)
            {
                int r = (int)( 1 + Math.random() * 10);
                army[c].info();
                army[c].takeDamage(r);
                System.out.println(army[c].getNickName() + " is attacked and takes " + r + " units of damage");
                System.out.print("    ");
                army[c].reaction();
            }
            System.out.println("");
        }

        System.out.println("How did the Warriors fare? ");
        for (int p = 0; p <5; p++)
        {
            army[p].info();
        }
    }
}
