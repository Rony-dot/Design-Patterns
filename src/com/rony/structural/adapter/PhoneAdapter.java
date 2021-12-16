package com.rony.structural.adapter;

public class PhoneAdapter implements Pen{
    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
