package com.rony.creational.factoryos.phone;

public class OSFactory {

    public OS  getInstance(String str){

        if(str.equalsIgnoreCase("Open"))
            return new Android();
        else if (str.equalsIgnoreCase("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
