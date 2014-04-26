package net.heartsavior.dev.bridge.abst;

import net.heartsavior.dev.bridge.impl.NavigableTV;


public class NavigableRemoteControl extends RemoteControl {
    public void nextChannel() {
        System.out.println("controller> Go to next channel");

        if (!(tv instanceof NavigableTV)) {
            System.out.println("controller> No response - maybe not supported");
            return;
        }

        ((NavigableTV)tv).nextChannel();
    }

    public void prevChannel() {
        System.out.println("controller> Go to prev channel");

        if (!(tv instanceof NavigableTV)) {
            System.out.println("controller> No response - maybe not supported");
            return;
        }

        ((NavigableTV)tv).prevChannel();
    }

}