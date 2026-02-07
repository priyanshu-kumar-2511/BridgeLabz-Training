package com.multithreading.threadstate;
import java.time.LocalTime;
import java.util.*;

public class StateMonitor extends Thread {

    private List<Thread> threads;
    private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(List<Thread> threads) {
        this.threads = threads;

        for (Thread t : threads) {
            stateHistory.put(t.getName(), new LinkedHashSet<>());
        }
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        while (!allTerminated) {

            allTerminated = true;

            for (Thread t : threads) {

                Thread.State state = t.getState();
                stateHistory.get(t.getName()).add(state);

                System.out.println("[Monitor] " +
                        t.getName() +
                        " is in " +
                        state +
                        " state at " +
                        LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        printSummary();
    }

    private void printSummary() {

        System.out.println("\n===== Summary =====");

        for (String name : stateHistory.keySet()) {
            Set<Thread.State> states = stateHistory.get(name);

            System.out.println(name +
                    " went through " +
                    states.size() +
                    " states: " +
                    states);
        }
    }
}
