package com.rony.behavioural.observer;

public class Subscriber implements Observer {
    private int subscriberId;
    private String subscriberName;
    private Channel channel = new Channel();

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(){
        System.out.println("hey "+subscriberName +", video uploaded : " + channel.getVideoTitle());
    }

    @Override
    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
