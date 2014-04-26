package net.heartsavior.dev;

import net.heartsavior.dev.bridge.abst.NavigableAndMemorizableRemoteControl;
import net.heartsavior.dev.bridge.abst.NavigableRemoteControl;
import net.heartsavior.dev.bridge.abst.RemoteControl;
import net.heartsavior.dev.bridge.impl.NavigableAndMemorizableTV;
import net.heartsavior.dev.bridge.impl.NavigableTV;
import net.heartsavior.dev.bridge.impl.TV;
import net.heartsavior.dev.bridge.impl.product.Philips;
import net.heartsavior.dev.bridge.impl.product.Sony;
import net.heartsavior.dev.bridge.impl.product.SonyV2;

public class TVUser {
    public static void main(String[] args) {
        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("Testing Remote Control...");
        testRemoteControl();

        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("Testing Remote Control with navigable...");
        testNavigableRemoteControl();

        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("Testing Remote Control with navigable and memorizable...");
        testNavigableAndMemorizableRemoteControl();
    }

    private static void testRemoteControl() {
        RemoteControl controller = new RemoteControl();
        controller.setTv(new Philips());
        controlTV(controller);
        controller.setTv(new Sony());
        controlTV(controller);
        controller.setTv(new SonyV2());
        controlTV(controller);

    }

    private static void testNavigableRemoteControl() {
        NavigableRemoteControl controller = new NavigableRemoteControl();
        controller.setTv(new Philips());
        controlNavigableTV(controller);
        controller.setTv(new Sony());
        controlNavigableTV(controller);
        controller.setTv(new SonyV2());
        controlNavigableTV(controller);

    }

    private static void testNavigableAndMemorizableRemoteControl() {
        NavigableAndMemorizableRemoteControl controller = new NavigableAndMemorizableRemoteControl();
        controller.setTv(new Philips());
        conrtolNavigableAndMemorizableTV(controller);
        controller.setTv(new Sony());
        conrtolNavigableAndMemorizableTV(controller);
        controller.setTv(new SonyV2());
        conrtolNavigableAndMemorizableTV(controller);

    }

    private static void controlTV(RemoteControl controller) {
        controller.on();
        controller.setChannel(10);
        controller.setChannel(11);
        controller.off();
        controller.on();
        controller.off();
    }

    private static void controlNavigableTV(NavigableRemoteControl controller) {
        controller.on();
        controller.setChannel(10);
        controller.nextChannel();
        controller.nextChannel();
        controller.prevChannel();
        controller.off();
        controller.on();
        controller.off();
    }

    private static void conrtolNavigableAndMemorizableTV(NavigableAndMemorizableRemoteControl controller) {
        controller.on();
        controller.setChannel(6);
        controller.memorizeCurrentChannel();
        controller.setChannel(7);
        controller.memorizeCurrentChannel();
        controller.setChannel(9);
        controller.memorizeCurrentChannel();
        controller.setChannel(11);
        controller.memorizeCurrentChannel();
        controller.nextChannel();
        controller.nextChannel();
        controller.forgetCurrentChannel();
        controller.nextChannel();
        controller.prevChannel();
        controller.off();
        controller.on();
        controller.off();
    }
}
