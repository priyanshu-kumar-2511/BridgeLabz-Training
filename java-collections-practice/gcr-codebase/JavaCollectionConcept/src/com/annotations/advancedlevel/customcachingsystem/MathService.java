package com.annotations.advancedlevel.customcachingsystem;

public class MathService {

    @CacheResult
    public int slowFibonacci(int n) {

        if (n <= 1)
            return n;

        return slowFibonacci(n - 1) +
               slowFibonacci(n - 2);
    }

    public int normalSquare(int n) {
        return n * n;
    }
}
