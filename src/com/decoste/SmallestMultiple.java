package com.decoste;

import java.util.Arrays;
//2520

public class SmallestMultiple {
    static int target = 1;
    static int[] numArray = {1,2,3,4,5,6,7,8,9,10};

    static int smallestMultiple(int[] numArray, int target) {
        for(int i = 0; i < numArray.length; i++) {
            int tempInt;
            tempInt = numArray[i];
            int divisible = target % tempInt;

            if(target % tempInt != 0) {
                target++;

            }
            target++;
            System.out.println(target);
        }

        return target;
    };
}
