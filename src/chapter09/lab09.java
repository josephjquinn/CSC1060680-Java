// Joseph Quinn
// CSC1060 Computer Science I, Section 680
// Oct 25, 2022
// This program uses a class to create a coffee object with built-in methods that dispense, and refill the ounces of coffee in the object variable.
package chapter09;

public class lab09
{
    public static void main(String[] args)
    {
        Coffee c1 = new Coffee();

        System.out.println(c1.returnOuncesRemaining() + " Ounces remaining");
        c1.dispense(56);
        c1.dispense(100);
        c1.refillDispenser();

    }
}
class Coffee
{
    int OuncesRemaining;

    Coffee()
    {
        OuncesRemaining = 128;
    }

    void refillDispenser()
    {
        OuncesRemaining = 128;
        System.out.println("Refilled coffee pot 128 ounces remaining");
    }

    void dispense(int amount)
    {
        if (amount < OuncesRemaining)
        {
            OuncesRemaining = OuncesRemaining - amount; System.out.println("Dispensed " + amount + " ounces off coffee " + returnOuncesRemaining() + " ounces remain");
        }
        else
        {
            System.out.println("Could not dispense " + returnOuncesRemaining() + " ounces remain");
        }
    }



    int returnOuncesRemaining()
    {
        return OuncesRemaining;
    }
}