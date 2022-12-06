package chapter05;

public class Lab05
{
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        do
        {
            int counter = 0;
            i = i + 1;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                System.out.println(i);
            }

        }
        while (i <= 25);
    }
}
