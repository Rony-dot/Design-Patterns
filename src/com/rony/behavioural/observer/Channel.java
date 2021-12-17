package com.rony.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private int channelId;
    private String channelName;
    private String videoTitle;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public Channel(int channelId, String channelName) {
        this.channelId = channelId;
        this.channelName = channelName;
    }

    public Channel() {
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void notifySubscribers(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update();
        }
    }

    public void upload(String title){
        this.videoTitle = title;
        notifySubscribers();
    }
}
