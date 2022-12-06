// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 9, 2022
// This program is a simulation of the casino game 'Craps'.

public class problem0630
{
    public static void main(String[] args)
    {
        int total = dice();
        int point = 0;
        System.out.println(total);


        switch(total)
        {
            case 2:
            case 3:
            case 12: System.out.println("You Lose"); System.exit(1);

            case 7:
            case 11: System.out.println("You Win!"); System.exit(1);

            default:
            {
                System.out.println("Point: " + total);
                point = total;
                break;

            }
        }


        while (true)
        {
            int roll = dice();
            System.out.println(roll);
            if (roll == 7)
            {
                System.out.println("You Lose");
                break;
            }
            else if (roll == point)
            {
                System.out.println("You Win!");
                break;
            }
        }



    }

    public static int dice()
    {
        int d1 = (int)( 1 + Math.random() * 6);
        int d2 = (int)( 1 + Math.random() * 6);
        int total = d1 + d2;
        return total;
    }

}
