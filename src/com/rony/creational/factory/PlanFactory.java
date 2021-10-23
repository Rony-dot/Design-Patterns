package com.rony.creational.factory;

public class PlanFactory {
    public Plan getPlan(int selctedPlan){

        EPlanType planType = EPlanType.getValue(selctedPlan);
        Plan plan = null;

        switch (planType){
            case COMMERCIAL:
                plan = new CommercialPlan();
                break;
            case DOMESTIC:
                plan = new DomesticPlan();
                break;
            case INSTITUTIONAL:
                plan = new InstitutionalPlan();
                break;
            default:
                System.out.println("Invalid selection...");
                break;

        }

        return plan;
    }
}
