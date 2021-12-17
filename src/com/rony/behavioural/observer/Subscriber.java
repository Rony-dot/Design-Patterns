package com.rony.behavioural.observer;

public class Subscriber {
    private int subscriberId;
    private String subscriberName;
    private Channel channel = new Channel();

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(){
        System.out.println("hey "+subscriberName +", video uploaded : " + channel.getVideoTitle());
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
