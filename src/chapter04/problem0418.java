// Joseph Quinn
// CSC 119 Intro to Programming, section 380
// Sep 13, 2022
// Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The first
//character indicates the major and the second is number character 1, 2, 3, 4, which
//indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
//the following characters are used to denote the majors:
//I: Information Management
//C: Computer Science
//A: Accounting

import java.util.*;

public class problem0418
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters:");
        String cm = input.nextLine();

        if (cm.length() >= 3)
        {
            System.out.print("Invalid Input");
            System.exit(1);
        }

        char mj = cm.charAt(0);
        char yr = cm.charAt(1);

        String major = "";
        String year = "";

        switch (mj)
        {
            case 'I':  major = "Information Management"; break;
            case 'C':  major = "Computer Science"; break;
            case 'A':  major = "Accounting"; break;
            default: System.out.println("Invalid Input"); System.exit(1);
        }

        switch(yr)
        {
            case '1':  year = "Freshman"; break;
            case '2':  year = "Sophomore"; break;
            case '3':  year = "Junior"; break;
            case '4':  year = "Senior"; break;
            default: System.out.println("Invalid Input"); System.exit(1);
        }

        System.out.print(major + " " + year);
    }
}