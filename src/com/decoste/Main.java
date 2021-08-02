package com.decoste;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /*
        Build an array with all multiples of 3 and 5 within a certain limit, then add all indices in the array together.
        https://projecteuler.net/problem=1
         */

        //Testing git push

        //Create object for ThreeAndFive Class
        ThreeAndFive threeAndFive = new ThreeAndFive();
        int m = 10000;
        threeAndFive.findSumOfMultiples(m);

        // Create object for EvenFibonacci class
        EvenFibonacci evenFib = new EvenFibonacci();
        System.out.println("The " + evenFib.n + " number in the Fibonacci sequence is " + evenFib.m);


        } // End Main method

    } // End Class Main

