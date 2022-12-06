package chapter10;
import java.util.Random;
public class lab10
{
    public static void main(String[] args)
    {
        Ewok e1 = new Ewok();
        e1.setAge(7);
        System.out.println("Ewok 1's age is "+e1.getAge());

        Ewok e2 = new Ewok();
        e2.setAge(3);
        System.out.println("Ewok 2's age is "+e2.getAge());

        System.out.println("Ewok 1 is making the noise "+e1.makeNoise());
    }
}

class Ewok
{
    String name;
    int age;

    Ewok()
    {
        name = "UghUgh";
        age = 0;
    }

    void setName(String nameinput)
    {
        name = nameinput;
    }
    void setAge(int ageinput)
    {
        age = ageinput;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    public String makeNoise()
    {
        String[] sounds = {"AAAAHHHH", "OOOHHGAAA", "PFFFFFRRRUPT", "SSSSOOODAAA", "meow"};
        int r = (int)(Math.random() * 5);
        System.out.println(r);
        return sounds[r];
    }
}
