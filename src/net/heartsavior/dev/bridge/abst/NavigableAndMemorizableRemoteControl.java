package net.heartsavior.dev.bridge.abst;

import net.heartsavior.dev.bridge.impl.NavigableAndMemorizableTV;

public class NavigableAndMemorizableRemoteControl extends NavigableRemoteControl {
    public void memorizeCurrentChannel() {
        System.out.println("controller> Memorize channel");

        if (!(tv instanceof NavigableAndMemorizableTV)) {
            System.out.println("controller> No response - maybe not supported");
            return;
        }

        ((NavigableAndMemorizableTV)tv).memorizeCurrentChannel();
    }

    public void forgetCurrentChannel() {
        System.out.println("controller> Forget channel");

        if (!(tv instanceof NavigableAndMemorizableTV)) {
            System.out.println("controller> No response - maybe not supported");
            return;
        }

        ((NavigableAndMemorizableTV)tv).forgetCurrentChannel();
    }

}
