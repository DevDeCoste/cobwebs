package com.decoste;

import java.util.Arrays;

public class LargestPrimeFactor {
    //if target mod 2 equals 1 then it is prime

    double target;
    static double[] primeFactors = new double[10];
    double largestPrime;


    static void findPrimeFactors(double target) {
        double x = target;
        boolean isPrime = false;


        // I know this loop isnt complete yet
        for(int i = 2; i < Math.sqrt(x); i++) {
            if(x / 2 != 0) {

                isPrime = true;

        // TODO Check if number is a multiple of the target, if so, add to array of prime numbers

                for(int j = 0; j < primeFactors.length; j++) {
                    // If there is no remainder after dividing the target number X by the current number in the loop N, add to array
                    if(x % i != 0)
                    primeFactors[j] = i;
                }
            }
        }

        if(isPrime) {
            System.out.println(Arrays.toString(primeFactors) + " are the prime factors of " + x);
        }




    }


}
