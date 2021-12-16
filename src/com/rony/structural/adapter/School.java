package com.rony.structural.adapter;

public class School {

    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Pen pen = new PhoneAdapter();
        assignment.setPen(pen);
        assignment.writeAssignment("I am a bit lazy");
    }
}
