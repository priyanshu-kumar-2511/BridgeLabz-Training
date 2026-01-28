package com.reflection.methodexecutiontiming;

public class TaskService {

    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            Math.sqrt(i);
        }
    }

    public void slowTask() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int compute(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
