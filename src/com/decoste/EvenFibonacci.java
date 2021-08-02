package com.decoste;

import java.util.Arrays;

public class EvenFibonacci {

    int n = 10;


    static int fib(int n)
    {
        int[] fibArray = new int[n+1];

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


    }

    int m = fib(n);





} // End Class EvenFibonacci
