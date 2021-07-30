package com.decoste;

public class EvenFibonacci {

    int n = 5;

    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
        return b;


    }

    int m = fib(n);







} // End Class EvenFibonacci
