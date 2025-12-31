/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
*/

public class DigitalWatchSimulation {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {          // 0 to 23
            for (int minute = 0; minute < 60; minute++) {  // 0 to 59

                // Print in 2-digit format (00:00, 01:09, 13:05)
                System.out.printf("%02d:%02d\n", hour, minute);

                // Power cut at exactly 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped.");
                    return;  
                }
            }
        }
    }
}
