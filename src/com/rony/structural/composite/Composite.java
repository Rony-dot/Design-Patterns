package com.rony.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    public String name;

    public Composite(String name) {
        this.name = name;
    }

    public List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component : components){
            component.showPrice();
        }
    }
}
