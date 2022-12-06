package chapter01;

public class problem0111
{
    public static void main(String[] args)
    {
        double starting_population = 312032486;
        double sec_in_year = 60*60*24*365;
        double net_gain = (sec_in_year)/7 - (sec_in_year)/13 + (sec_in_year)/45;

        double year1 = net_gain + starting_population;
        double year2 = net_gain*2 + starting_population;
        double year3 = net_gain*3 + starting_population;
        double year4 = net_gain*4 + starting_population;
        double year5 = net_gain*5 + starting_population;

        System.out.println("Year 1: " + (int)year1);
        System.out.println("Year 2: " + (int)year2);
        System.out.println("Year 3: " + (int)year3);
        System.out.println("Year 4: " + (int)year4);
        System.out.println("Year 5: " + (int)year5);
    }
}
