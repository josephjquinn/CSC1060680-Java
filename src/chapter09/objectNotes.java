package chapter09;

public class objectNotes
{
    public static void main(String[] args)
    {
        TV tv1 = new TV();

        System.out.println(tv1.on);
        tv1.turnOn();
        System.out.println(tv1.on);

        System.out.println(tv1.volumeLevel);
        tv1.setVolume(6);
        System.out.println(tv1.volumeLevel);
        tv1.volumeDown();
        System.out.println(tv1.volumeLevel);

    }
}
