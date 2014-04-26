package net.heartsavior.dev.bridge.impl.product;

import net.heartsavior.dev.bridge.impl.NavigableTV;

public class Philips extends BaseTVImpl implements NavigableTV
{
    protected int DEFAULT_CHANNEL = 10;

    @Override
    public void turnOn()
    {
        super.turnOn();

        print("Philips TV is on");
        watchDefaultChannel();
    }

    @Override
    public void turnOff()
    {
        super.turnOff();

        print("Philips TV is off");
    }

    @Override
    public void tuneChannel(int channel)
    {
        super.tuneChannel(channel);

        printStatus();
    }

    @Override
    public void printStatus() {
        print("Current channel: " + this.channel);
    }

    @Override
    public void nextChannel() {
        if (!running)
            return;

        this.channel++;
        printStatus();
    }

    @Override
    public void prevChannel() {
        if (!running)
            return;

        this.channel--;
        printStatus();
    }

    protected void watchDefaultChannel() {
        print("Go to default channel");
        tuneChannel(DEFAULT_CHANNEL);
    }

    protected void print(String message) {
        System.out.println("[" + this.getClass().getSimpleName() + "]" + " " + message);
    }

}
