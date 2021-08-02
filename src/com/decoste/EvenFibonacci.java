package com.decoste;

import java.util.Arrays;

public class EvenFibonacci {

    static int n = 10;
    int m = fib(n);
    static int[] fibArray = new int[n+1];
//    int[] tempArray = evenFibs(fibArray[]);

    static int fib(int n)
    {


        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 1; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            fibArray[i-1] = c;
        }
        System.out.println(Arrays.toString(fibArray));
        return b;


    } // End fib() method


    // TODO Add logic for checking if number is even then add to new tempArray
    static void evenFibs(int[] fibArray) {
        for(int i = 0; i < fibArray.length-1; i++) {
            System.out.println(fibArray[i]);
        }
    }


} // End Class EvenFibonacci
