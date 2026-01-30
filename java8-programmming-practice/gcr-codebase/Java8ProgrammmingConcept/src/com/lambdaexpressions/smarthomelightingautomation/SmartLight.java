package com.lambdaexpressions.smarthomelightingautomation;

public class SmartLight {

    private LightBehavior behavior;

    public void setBehavior(LightBehavior behavior) {
        this.behavior = behavior;
    }

    public void trigger() {
        if (behavior != null) {
            behavior.activate();
        } else {
            System.out.println("No behavior defined.");
        }
    }
}
