// Joseph Quinn
// CSC 119 Intro to Programming, section 380
// Sep 13, 2022
// This program outputs the unicode for an inputted character
import java.util.*;
public class problem0409
{
    public static void main(String[] args)
    {
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        int uni = (int)letter;
        System.out.println("The unicode for "+ letter + " is " + uni);



    }
}
