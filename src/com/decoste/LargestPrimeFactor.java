package com.decoste;

public class LargestPrimeFactor {
    //if target mod 2 equals 1 then it is prime

    double target;
    double[] primeFactors;
    double largestPrime;
// TODO This whole problem
    static void findPrimeFactors(double target) {
        double x = target;
        double isPrime = Math.sqrt(x);

        // I know this loop isnt complete yet
        for(int i = 2; i < Math.sqrt(x); i++) {
            if(isPrime == 1) {
                System.out.println(x + " Is Prime");
            }
        }




    }


}
