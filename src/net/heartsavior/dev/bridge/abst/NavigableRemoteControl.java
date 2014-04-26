package net.heartsavior.dev.bridge.abst;

import net.heartsavior.dev.bridge.impl.NavigableTV;

public class NavigableRemoteControl extends RemoteControl {
    protected NavigableTV tv;

    public void nextChannel() {
        System.out.println("controller> Go to next channel");

        if (tv != null)
            tv.nextChannel();
        else
            System.out.println("controller> Not supported operation for this TV");
    }

    public void prevChannel() {
        System.out.println("controller> Go to prev channel");

        if (tv != null)
            tv.prevChannel();
        else
            System.out.println("controller> Not supported operation for this TV");
    }

    public void setTv(NavigableTV tv) {
        this.tv = tv;
        super.setTv(tv);
    }

}