package com.rony.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private int channelId;
    private String channelName;
    private String videoTitle;
    private List<Observer> subscriberList = new ArrayList<>();

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

    @Override
    public void subscribe(Observer subscriber){
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Observer subscriber){
        subscriberList.remove(subscriber);
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Override
    public void notifySubscribers(){
        for(Observer subscriber : subscriberList){
            subscriber.update();
        }
    }

    @Override
    public void upload(String title){
        this.videoTitle = title;
        notifySubscribers();
    }
}
