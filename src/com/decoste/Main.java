package com.decoste;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /*
        PROBLEM 1
        Build an array with all multiples of 3 and 5 within a certain limit, then add all indices in the array together.
        https://projecteuler.net/problem=1
         */

        //Create object for ThreeAndFive Class
        ThreeAndFive threeAndFive = new ThreeAndFive();
        int m = 10000;
        threeAndFive.findSumOfMultiples(m);

        /*
        PROBLEM 2
        Add all even terms of the Fib sequence below 4 million together
        https://projecteuler.net/problem=2
         */

        // Create object for EvenFibonacci class
        EvenFibonacci evenFib = new EvenFibonacci();
        System.out.println("The " + evenFib.n + " number in the Fibonacci sequence is " + evenFib.m);

        System.out.println("The sum of the even-valued terms in the fibonacci sequence, not exceeding 4 million is " + evenFib.finalSum);


        /*
        PROBLEM 3
        Largest prime factor of the number 600851475143
        https://projecteuler.net/problem=3
         */


        } // End Main method

    } // End Class Main

