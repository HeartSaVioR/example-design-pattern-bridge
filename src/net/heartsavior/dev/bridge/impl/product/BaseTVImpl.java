package net.heartsavior.dev.bridge.impl.product;

import net.heartsavior.dev.bridge.impl.TV;

public abstract class BaseTVImpl implements TV {
    protected boolean running;
    protected int channel;

    @Override
    public void turnOn()
    {
        this.running = true;
    }

    @Override
    public void turnOff()
    {
        this.running = false;
    }

    @Override
    public void tuneChannel(int channel)
    {
        if (!this.running)
            return;

        this.channel = channel;
    }

}
