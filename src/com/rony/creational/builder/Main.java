package com.rony.creational.builder;

import com.rony.creational.builder.phone.Phone;
import com.rony.creational.builder.phone.PhoneBuilder;

public class Main {
    public static void main(String[] args) {
        // using builder pattern creating phone object
        // specify only those which we need, others will get default values
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).setBattery(4000).getPhone();
        System.out.println(phone);
    }
}
