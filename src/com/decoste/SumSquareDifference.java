package com.decoste;

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDifference {
    int arraySize = 100;
    int[] numbers = new int[arraySize];





    static int[] buildArray(int[] numbers, int arraySize) {
        int count = 1;
        int sum = 0;
        int sumOfSquares = 0;
        int squareOfSum;
        int sumDiff = 0;

        for(int i = 0; i <= arraySize - 1; i++){
            numbers[i] = count;

            sum += count;
            sumOfSquares += count * count;
            count++;




        }

        squareOfSum = sum * sum;

        sumDiff = squareOfSum - sumOfSquares;

        System.out.println("The sum of the natural numbers up to " + arraySize + " is " +  sum);

        System.out.println("The square of the sum of the natural numbers up to " + arraySize + " is " + squareOfSum);

        System.out.println("The sum of the squares of the natural numbers up to " + arraySize + " is " + sumOfSquares);

        System.out.println("The difference between these 2 numbers is " + sumDiff);




        return numbers;
    } //End BuildArray Method



}
