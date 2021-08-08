package com.decoste;

import java.util.Arrays;
//2520

public class SmallestMultiple {
    static long target;
    static long[] numArray = {1,2,3,4,5,6,7,8,9,10};

    static long smallestMultiple(long[] numArray, long target) {

        //These loops are not doing what they should be...

        for(int i = 0; i > 0; i++) {
            boolean isDivisible = true;


//            long tempInt;
//            tempInt = numArray[i];


            for(int j = 1; j < 20; j++) {
                int s = i % j;
//                long divisible = tempInt % j;
                if(s != 0) {
                    isDivisible = false;
                    //System.out.print(target + " Is Not a Multiple of " + tempInt + "\n");
//                    target++;

                } else
                target++;
                //System.out.println(target + " is a multiple of " + tempInt + "\n");
            }

            if(isDivisible) {
                System.out.println(i);
            }

        }

        return target;
    };
}
