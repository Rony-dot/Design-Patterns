package com.rony.creational.factory;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        System.out.println("Calculated Rate : "+ units*rate);
    }

}
