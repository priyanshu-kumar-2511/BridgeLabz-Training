package com.annotations.beginnerlevel.annotationforpendingtasks;

public class ProjectModule {

    @Todo(
        task = "Implement payment gateway integration",
        assignedTo = "Ravi",
        priority = "HIGH"
    )
    public void paymentFeature() {
        System.out.println("Payment feature logic");
    }

    @Todo(
        task = "Refactor legacy code",
        assignedTo = "Anita"
    )
    public void refactorCode() {
        System.out.println("Refactoring logic");
    }

    public void completedFeature() {
        System.out.println("Already completed feature");
    }
}
