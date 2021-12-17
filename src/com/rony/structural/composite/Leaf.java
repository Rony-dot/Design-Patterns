package com.rony.structural.composite;

public class Leaf implements Component{

    public int price;
    public String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
