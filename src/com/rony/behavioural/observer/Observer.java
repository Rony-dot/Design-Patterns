package com.rony.behavioural.observer;

public interface Observer {
    void update();
    void subscribeChannel(Channel channel);
}
