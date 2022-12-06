package textbook;
import java.util.Scanner;
public class problem0213
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthly_savings = input.nextInt();

        double month_1 = monthly_savings * (1 + 0.003125);
        double month_2 = (monthly_savings + month_1) * (1 + 0.003125);
        double month_3 = (monthly_savings + month_2) * (1 + 0.003125);
        double month_4 = (monthly_savings + month_3) * (1 + 0.003125);
        double month_5 = (monthly_savings + month_4) * (1 + 0.003125);
        double month_6 = (monthly_savings + month_5) * (1 + 0.003125);

        System.out.println("After the first month, the account value is " + month_1);
        System.out.println("After the second month, the account value is " + month_2);
        System.out.println("After the third month, the account value is " + month_3);
        System.out.println("After the sixth month, the account value is " + month_6);


    }
}
