package com.collections.votingsystem;

/*Design a Voting System
Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
*/

import java.util.*;

public class VotingSystem {

    private Map<String, Integer> voteCount = new HashMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {

        voteCount.merge(candidate, 1, Integer::sum);

        voteOrder.putIfAbsent(candidate, 0);
    }

    public void displayVoteOrder() {

        System.out.println("Vote Order (Insertion Order):");

        for (String candidate : voteOrder.keySet()) {
            System.out.println(candidate + " : " + voteCount.get(candidate));
        }
    }

    public void displaySortedResults() {

        System.out.println("Sorted Results (Alphabetical):");

        TreeMap<String, Integer> sorted = new TreeMap<>(voteCount);

        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    
    // main method 
    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Carol");
        system.castVote("Bob");

        system.displayVoteOrder();
        System.out.println();
        system.displaySortedResults();
    }
}
