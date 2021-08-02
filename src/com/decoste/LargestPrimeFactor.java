package com.decoste;

public class LargestPrimeFactor {
    //if target mod 2 equals 1 then it is prime

    int target;
    int[] primeFactors;
    int largestPrime;

    static void findPrimeFactors(int target) {
        int x = target;
        int isPrime = x % 2;
        if(isPrime == 1) {
            System.out.println("Is Prime");
    }


    }


}
