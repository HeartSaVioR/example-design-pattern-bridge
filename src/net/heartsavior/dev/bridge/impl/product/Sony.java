package net.heartsavior.dev.bridge.impl.product;

import net.heartsavior.dev.bridge.impl.NavigableTV;

public class Sony extends BaseTVImpl implements NavigableTV
{
    protected int DEFAULT_CHANNEL = 10;
    protected int lastWatchedChannelBeforeOff = DEFAULT_CHANNEL;

    @Override
    public void turnOn()
    {
        super.turnOn();

        print("Welcome to sony style");
        restoreLastWatchingChannel();
    }

    @Override
    public void turnOff()
    {
        super.turnOff();

        print("See you later");
        this.lastWatchedChannelBeforeOff = this.channel;
    }

    @Override
    public void tuneChannel(int channel)
    {
        super.tuneChannel(channel);

        printStatus();
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

    @Override
    public void printStatus() {
        print("You're watching channel " + this.channel);
    }

    protected void restoreLastWatchingChannel() {
        print("Restore your last watching channel");
        tuneChannel(lastWatchedChannelBeforeOff);
    }

    protected void print(String message) {
        System.out.println("<" + this.getClass().getSimpleName() + ">" + " " + message);
    }
}
