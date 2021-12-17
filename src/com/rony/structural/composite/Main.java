package com.rony.structural.composite;

public class Main {
    public static void main(String[] args) {
        Component hdd = new Leaf(4000, "HDD");
        Component monitor = new Leaf(10000, "Monitor");
        Component mouse = new Leaf(500,"Mouse");
        Component ram = new Leaf(3500,"RAM");
        Component cpu = new Leaf(9000,"CPU");

        Composite ph = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite pc = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(monitor);
        ph.addComponent(mouse);

        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);

        pc.addComponent(ph);
        pc.addComponent(cabinet);

        pc.showPrice();


    }
}
