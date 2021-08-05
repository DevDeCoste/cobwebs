package com.decoste;

import java.lang.Math;
import java.util.Arrays;

public class PowerDigitSum {

    double n = 2;
    double pow = 1000;

    static double findDigitSum(double n, double pow) {
    double power = Math.pow(n,pow);
        double sum = 0;

    int[] powerArray = String.valueOf(power).replaceAll("\\D","").chars().map(Character::getNumericValue).toArray();

    for(int i = 0; i <= powerArray.length - 1; i++) {

        sum += powerArray[i];
    }

        System.out.println("The sum of the digits of the number 2 to the 1000th power is " + sum);

    return power;

    } // End method

}
