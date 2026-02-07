package com.multithreading.restaurantorder;

public class Chef extends Thread {

    private String dish;
    private double preparationTime; // in seconds

    public Chef(String name, String dish, double preparationTime) {
        super(name); // set thread name
        this.dish = dish;
        this.preparationTime = preparationTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        int[] milestones = {25, 50, 75, 100};

        for (int progress : milestones) {
            try {
                // divide total time into 4 equal parts
                Thread.sleep((long) ((preparationTime * 1000) / 4));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " preparing " + dish + ": " + progress + "% complete");
        }
        System.out.println(getName() + " completed " + dish);
    }
}
