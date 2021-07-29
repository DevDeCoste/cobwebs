package com.decoste;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /*
        Build an array with all multiples of 3 and 5 within a certain limit, then add all indices in the array together.
         */

        int m = 1000;

        findSumOfMultiples(m);


        } // End Main method

    static void findSumOfMultiples(int limit) {
        int count = 0;
        int size = limit;
        int multiplesOfThreeOrFive[] = new int[size+1];

        int sumOfMultiples = 0;


        for (int x = 1; x < size; x++) {
            int k = x % 3;
            int j = x % 5;

            if(k == 0) {
                //System.out.println(x + " is an multiple of 3");
                multiplesOfThreeOrFive[count] = x;
                count++;

            } else if (j == 0) {
                //System.out.println(x + " is a multiple of 5");
                multiplesOfThreeOrFive[count] = x;
                count++;
            };

        } // End For loop

        System.out.println(Arrays.toString(multiplesOfThreeOrFive));

        for (int p = 0; p < multiplesOfThreeOrFive.length; p++) {
            sumOfMultiples = sumOfMultiples + multiplesOfThreeOrFive[p];

        }
        System.out.println("The sum of all multiples of 3 and 5 below " + size + " is " + sumOfMultiples);

    } // End findSumMultiples Method

    } // End Class Main

