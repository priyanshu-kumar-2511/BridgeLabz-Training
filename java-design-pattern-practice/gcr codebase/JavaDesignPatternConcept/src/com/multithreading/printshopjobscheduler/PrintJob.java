package com.multithreading.printshopjobscheduler;

public class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;
    private static final Object printerLock = new Object(); // single printer

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public void run() {

        String priorityLabel;

        if (priority >= 8)
            priorityLabel = "[High Priority]";
        else if (priority >= 5)
            priorityLabel = "[Medium Priority]";
        else
            priorityLabel = "[Low Priority]";

        synchronized (printerLock) {  // only one job prints at a time

            for (int i = 1; i <= pages; i++) {
                try {
                    Thread.sleep(100); // 100ms per page
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(priorityLabel + " Printing "
                        + jobName + " - Page " + i + " of " + pages);
            }
            System.out.println(priorityLabel + " " + jobName + " completed.\n");
        }
    }
}
