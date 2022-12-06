package chapter09;

public class TV
{
    int channel;
    int volumeLevel;
    boolean on;

    public TV()
    {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

  public void setChannel(int newChannel)
  {
      if (on && newChannel >= 1 && newChannel <= 120)
     channel = newChannel;
  }

  public void setVolume(int newVolumeLevel)
  {
      if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
          volumeLevel = newVolumeLevel;
  }

  public void volumeUp()
  {
      if (on && volumeLevel < 7)
          volumeLevel++;
  }

  public void volumeDown()
  {
      if (on && volumeLevel > 1)
          volumeLevel--;
  }

}
