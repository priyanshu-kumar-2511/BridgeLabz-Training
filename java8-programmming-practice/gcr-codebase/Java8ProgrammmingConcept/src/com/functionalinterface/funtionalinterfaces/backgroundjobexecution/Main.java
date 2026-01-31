package com.functionalinterface.funtionalinterfaces.backgroundjobexecution;

/*3. Background Job Execution
○ Scenario: Execute tasks asynchronously.
○ Task: Use Runnable functional interface.
*/
public class Main {

    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job finished.");
        };

        Thread thread = new Thread(job);
        thread.start();

        System.out.println("Main thread continues...");
    }
}
