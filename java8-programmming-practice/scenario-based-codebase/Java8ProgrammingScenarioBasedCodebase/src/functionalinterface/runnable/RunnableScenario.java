package functionalinterface.runnable;

/*Scenario 6: Runnable (Task Execution)

1.Run a background task using Runnable.

2.Execute a file cleanup task using Runnable.

3.Print a message in a separate thread using Runnable.*/

public class RunnableScenario {

    public static void main(String[] args) {

        /* 1️ Run a background task */

        Runnable backgroundTask = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Background task completed.");
        };

        Thread bgThread = new Thread(backgroundTask, "Background-Thread");
        bgThread.start();

        /* 2️ Execute file cleanup task */

        Runnable fileCleanupTask = () -> {
            System.out.println("File cleanup started...");
            try {
                Thread.sleep(1500); // simulate cleanup
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Temporary files deleted successfully.");
        };

        Thread cleanupThread = new Thread(fileCleanupTask, "Cleanup-Thread");
        cleanupThread.start();

        /* 3️ Print message in separate thread */

        Runnable printMessageTask = () -> System.out.println("Hello from a separate thread!");
        Thread messageThread = new Thread(printMessageTask, "Message-Thread");
        messageThread.start();

        /* Wait for all threads to finish */

        try {
            bgThread.join();
            cleanupThread.join();
            messageThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Main thread completed.");
    }
}
