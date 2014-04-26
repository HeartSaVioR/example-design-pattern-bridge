package net.heartsavior.dev;

import net.heartsavior.dev.bridge.abst.NavigableAndMemorizableRemoteControl;
import net.heartsavior.dev.bridge.abst.NavigableRemoteControl;
import net.heartsavior.dev.bridge.abst.RemoteControl;
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
        TVFactory factory = new TVFactory();
        controller.setTv(factory.createTV(TVFactory.TVKind.PHILIPS));
        controlTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONY));
        controlTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONYV2));
        controlTV(controller);

    }

    private static void testNavigableRemoteControl() {
        NavigableRemoteControl controller = new NavigableRemoteControl();
        TVFactory factory = new TVFactory();
        controller.setTv(factory.createTV(TVFactory.TVKind.PHILIPS));
        controlNavigableTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONY));
        controlNavigableTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONYV2));
        controlNavigableTV(controller);

    }

    private static void testNavigableAndMemorizableRemoteControl() {
        NavigableAndMemorizableRemoteControl controller = new NavigableAndMemorizableRemoteControl();
        TVFactory factory = new TVFactory();
        controller.setTv(factory.createTV(TVFactory.TVKind.PHILIPS));
        conrtolNavigableAndMemorizableTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONY));
        conrtolNavigableAndMemorizableTV(controller);
        controller.setTv(factory.createTV(TVFactory.TVKind.SONYV2));
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
        controller.setChannel(15);
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

    static class TVFactory {
        public static enum TVKind {
            SONY, SONYV2, PHILIPS
        }

        public TV createTV(TVKind kind) {
            switch (kind) {
                case SONY:
                    return new Sony();
                case PHILIPS:
                    return new Philips();
                case SONYV2:
                    return new SonyV2();
            }
            return null;
        }

    }
}
