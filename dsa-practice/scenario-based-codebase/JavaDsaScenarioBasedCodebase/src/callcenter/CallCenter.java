package callcenter;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();
    private PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> 0);   // FIFO for VIPs

    private HashMap<String, Integer> callHistory = new HashMap<>();

    // New incoming call
    public void receiveCall(Customer call) {
        callHistory.put(call.number, callHistory.getOrDefault(call.number, 0) + 1);

        if (call.vip) {
            vipQueue.offer(call);
            System.out.println("VIP Call from " + call.name);
        } else {
            normalQueue.offer(call);
            System.out.println("Call from " + call.name);
        }
    }

    // Handle next call
    public void handleNextCall() {
        Customer call;

        if (!vipQueue.isEmpty())
            call = vipQueue.poll();
        else if (!normalQueue.isEmpty())
            call = normalQueue.poll();
        else {
            System.out.println("No calls waiting");
            return;
        }

        System.out.println("Handling call: " + call);
    }

    // Show call history
    public void showCallCount(String number) {
        System.out.println("This number has called " + callHistory.getOrDefault(number, 0) + " times");
    }
}
