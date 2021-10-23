package com.rony.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select a suitable plan");
        System.out.println("1=Commercial plan");
        System.out.println("2=Domestic plan");
        System.out.println("3=Institutional plan");
        int chosenPlan = Integer.parseInt(bufferedReader.readLine());
        System.out.printf("please enter units : ");
        int units = Integer.parseInt(bufferedReader.readLine());

        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan(chosenPlan);
        // setting the rates internal calling
        plan.getRate();

        System.out.println("calculating the units "+units + " of rate : "+plan.rate);

        plan.calculateBill(units);

    }
}
