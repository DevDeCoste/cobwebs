package com.decoste;

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDifference {
    int arraySize = 100;
    int[] numbers = new int[arraySize];

    int sumOfSquares;
    int squareOfSum;



    static int[] buildArray(int[] numbers, int arraySize) {
        int count = 1;
        for(int i = 0; i < arraySize + 1; i++){
            numbers[i] = count;
            count++;
        }

        return numbers;
    } //End BuildArray Method



}
