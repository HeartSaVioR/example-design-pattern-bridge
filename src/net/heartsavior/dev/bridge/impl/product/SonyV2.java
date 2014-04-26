package net.heartsavior.dev.bridge.impl.product;

import net.heartsavior.dev.bridge.impl.NavigableAndMemorizableTV;

import java.util.ArrayList;
import java.util.List;

public class SonyV2 extends Sony implements NavigableAndMemorizableTV {
    protected List<Integer> memorizedChannels;

    public SonyV2() {
        memorizedChannels = new ArrayList<>();
    }

    @Override
    public void nextChannel() {
        if (memorizedChannels.isEmpty()) {
            super.nextChannel();
            return;
        }

        int idx = memorizedChannels.indexOf(channel);
        int nextIndex = 0;

        if (idx >= 0) {
            nextIndex = (idx + 1) % (memorizedChannels.size());
        }

        tuneChannel(memorizedChannels.get(nextIndex));
    }

    @Override
    public void prevChannel() {
        if (memorizedChannels.isEmpty()) {
            super.prevChannel();
            return;
        }

        int idx = memorizedChannels.indexOf(channel);
        int nextIndex = 0;

        if (idx == 0) {
            nextIndex = memorizedChannels.size() - 1;
        } else if (idx > 0) {
            nextIndex = (idx - 1);
        }

        tuneChannel(memorizedChannels.get(nextIndex));
    }

    @Override
    public void memorizeCurrentChannel() {
        if (!memorizedChannels.contains(channel)) {
            memorizedChannels.add(channel);
            print("Memorizing channel " + channel);
        } else {
            print("Already memorized channel " + channel);
        }
    }

    @Override
    public void forgetCurrentChannel() {
        if (memorizedChannels.contains(channel)) {
            memorizedChannels.remove(new Integer(channel));
            print("Forgetting channel " + channel);
        } else {
            print("Not memorized channel " + channel);
        }
    }

}
