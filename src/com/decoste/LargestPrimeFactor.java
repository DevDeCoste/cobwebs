package com.decoste;

public class LargestPrimeFactor {
    //if target mod 2 equals 1 then it is prime

    double target;
    double[] primeFactors;
    double largestPrime;
// TODO This whole problem
    static void findPrimeFactors(double target) {
        double x = target;
        boolean isPrime = false;

        // I know this loop isnt complete yet
        for(int i = 2; i < Math.sqrt(x); i++) {
            if(x / 2 != 0) {
                isPrime = true;
            }
        }

        if(isPrime) {
            System.out.println(x + " is a prime number");
        }




    }


}
