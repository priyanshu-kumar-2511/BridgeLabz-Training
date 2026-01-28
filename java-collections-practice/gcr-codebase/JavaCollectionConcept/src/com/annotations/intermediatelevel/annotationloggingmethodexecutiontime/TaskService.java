package com.annotations.intermediatelevel.annotationloggingmethodexecutiontime;

public class TaskService {

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Slow method executed");
    }

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Fast method executed");
    }

    public void normalMethod() {
        System.out.println("Normal method executed");
    }
}
