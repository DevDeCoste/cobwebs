package com.decoste;

import java.util.Arrays;

public class LargestPrimeFactor {
    //if target mod 2 equals 1 then it is prime

    double target;
    static double[] primeFactors = new double[10];
    double largestPrime;

// TODO This whole problem
    static void findPrimeFactors(double target) {
        double x = target;
        boolean isPrime = false;


        // I know this loop isnt complete yet
        for(int i = 2; i < Math.sqrt(x); i++) {
            if(x / 2 != 0) {

                isPrime = true;

                for(int j = 0; j < primeFactors.length; j++) {
                    primeFactors[j] = x;
                }
            }
        }

        if(isPrime) {
            System.out.println(Arrays.toString(primeFactors) + " are the prime factors of" + x);
        }




    }


}
