package com.annotations.advancedlevel.customcachingsystem;

/*7️. Implement a Custom Caching System with @CacheResult
✅ Problem Statement:
Define @CacheResult to store method return values and avoid repeated execution.
🔹 Requirements:
Apply @CacheResult to a computationally expensive method.
Implement a cache (HashMap) to store previously computed results.
If method is called with the same input, return cached result instead of re-computation.
*/

public class Main {

    public static void main(String[] args) throws Exception {

        MathService service = new MathService();

        long start1 = System.nanoTime();
        Object result1 = CacheExecutor.execute(service,
                "slowFibonacci", 35);
        long end1 = System.nanoTime();

        System.out.println("Result: " + result1);
        System.out.println("Time1: " + (end1 - start1));

        long start2 = System.nanoTime();
        Object result2 = CacheExecutor.execute(service,
                "slowFibonacci", 35);
        long end2 = System.nanoTime();

        System.out.println("Result: " + result2);
        System.out.println("Time2: " + (end2 - start2));
    }
}
