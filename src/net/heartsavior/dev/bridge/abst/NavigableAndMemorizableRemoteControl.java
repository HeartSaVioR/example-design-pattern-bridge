package net.heartsavior.dev.bridge.abst;

import net.heartsavior.dev.bridge.impl.NavigableAndMemorizableTV;

public class NavigableAndMemorizableRemoteControl extends NavigableRemoteControl {
    protected NavigableAndMemorizableTV tv;

    public void memorizeCurrentChannel() {
        System.out.println("controller> Memorize channel");

        if (tv != null)
            tv.memorizeCurrentChannel();
        else
            System.out.println("controller> Not supported operation for this TV");
    }

    public void forgetCurrentChannel() {
        System.out.println("controller> Forget channel");

        if (tv != null)
            tv.forgetCurrentChannel();
        else
            System.out.println("controller> Not supported operation for this TV");

    }

    public void setTv(NavigableAndMemorizableTV tv) {
        this.tv = tv;
        super.setTv(tv);
    }
}
