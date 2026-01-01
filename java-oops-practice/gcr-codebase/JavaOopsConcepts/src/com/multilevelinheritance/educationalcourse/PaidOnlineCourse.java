package com.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;   // percentage

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + (fee - (fee * discount / 100)));
    }
}
