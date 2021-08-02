package com.decoste;

import java.util.Arrays;

public class ThreeAndFive {


    static void findSumOfMultiples(int limit) {
        int size = limit;
        int count = 0;
        int sumOfMultiples = 0;
        int multiplesOfThreeOrFive[] = new int[size+1];

        for (int x = 1; x < size; x++) {
            int k = x % 3;
            int j = x % 5;

            if(k == 0 || j == 0) {
                multiplesOfThreeOrFive[count] = x;
                count++;
            };

        } // End For loop

        //Print Array
        //System.out.println(Arrays.toString(multiplesOfThreeOrFive));

        for (int p = 0; p < multiplesOfThreeOrFive.length; p++) {
            sumOfMultiples += multiplesOfThreeOrFive[p];

        }
        System.out.println("The sum of all multiples of 3 and 5 below " + size + " is " + sumOfMultiples);

    } // End findSumMultiples Method


} // End Class


