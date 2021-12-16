package com.rony.creational.factoryos;

import com.rony.creational.factoryos.phone.Android;
import com.rony.creational.factoryos.phone.IOS;
import com.rony.creational.factoryos.phone.OS;
import com.rony.creational.factoryos.phone.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {

        // creating object by factory
        OSFactory osFactory = new OSFactory();
        OS obj = osFactory.getInstance("Open");
        obj.specification();

        // creating object individually
//        OS os = new IOS();
//        os.specification();
    }
}
