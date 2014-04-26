package net.heartsavior.dev.bridge.abst;

import net.heartsavior.dev.bridge.impl.TV;

public class RemoteControl {
    protected TV tv;

    public void on() {
        System.out.println("controller> Turn On TV");
        tv.turnOn();
    }

    public void off() {
        System.out.println("controller> Turn Off TV");
        tv.turnOff();
    }

    public void setChannel(int channel) {
        System.out.println("controller> Set channel to " + channel);
        tv.tuneChannel(channel);
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
