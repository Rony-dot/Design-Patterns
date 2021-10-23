package com.rony.creational.factory;

import java.util.stream.Stream;

public enum EPlanType {
    COMMERCIAL(1),
    DOMESTIC(2),
    INSTITUTIONAL(3);

    private int planType;

    EPlanType(int planType) {
        this.planType = planType;
    }

    public static EPlanType  getValue(int selectedPlan){
        return Stream.of(EPlanType.values())
                .filter(e -> e.planType == selectedPlan)
                .findFirst()
                .get();
    }

}
