package com.rony.behavioural.observer;

/**
 * Observer design pattern => Behavioural design pattern
 * Subscriber (Observer) subscribe to a Channel (Subject)
 */
public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel();
        Subscriber subscriber1 = new Subscriber("Rony");
        Subscriber subscriber2 = new Subscriber("Rabbi");
        Subscriber subscriber3 = new Subscriber("Ripa");
        Subscriber subscriber4 = new Subscriber("Sharmin");

        ch.subscribe(subscriber1);
        ch.subscribe(subscriber2);
        ch.subscribe(subscriber3);
        ch.subscribe(subscriber4);

        subscriber1.subscribeChannel(ch);
        subscriber2.subscribeChannel(ch);
        subscriber3.subscribeChannel(ch);
        subscriber4.subscribeChannel(ch);

        ch.upload("my first video");

    }
}
