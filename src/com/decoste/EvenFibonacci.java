package com.decoste;

import java.util.Arrays;

public class EvenFibonacci {

    // 33rd number in sequence is 3.5mil and highest below 4mil
    static int n = 33;
    int m = fib(n);
    static int[] fibArray = new int[n];
//    int[] tempArray = evenFibs(fibArray[]);

    static int fib(int n)
    {


        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 1; i <= n-1; i++)
        {

            c = a + b;
            a = b;
            b = c;
            fibArray[i-1] = c;
        }
        //Print Array
        //System.out.println(Arrays.toString(fibArray));
        return b;


    } // End fib() method


    // TODO Add logic for checking if number is even then add to new tempArray
    static int evenFibSum(int[] fibArray) {
        int sum = 0;
        int tempSum = 0;
        for(int i = 0; i < fibArray.length-1; i++) {
            tempSum += fibArray[i];
            if(i % 2 == 0) {
                sum += fibArray[i];
            }


            //System.out.println(fibArray[i]);
        }
        return sum;
    }

    int finalSum = evenFibSum(fibArray);

} // End Class EvenFibonacci
