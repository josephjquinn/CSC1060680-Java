package textbook;
import java.util.Scanner;

public class problem0207
    {
        public static void main(String[] args)
        {
            System.out.print("Enter the number of minutes: ");
            Scanner input = new Scanner(System.in);
            int minutes = input.nextInt();
            int years = ((minutes / 60) / 24) / 365;
            int days = ((minutes / 60) / 24) % 365;
            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        }
}
