package com.decoste;

import java.util.Arrays;
//2520

public class SmallestMultiple {
    static int target = 1;
    static int[] numArray = {1,2,3,4,5,6,7,8,9,10};

    static int smallestMultiple(int[] numArray, int target) {

        //These loops are not doing what they should be...

        for(int i = 0; i < numArray.length; i++) {
            int tempInt;
            tempInt = numArray[i];


            for(int j = 1; j < 11; j++) {
                int divisible = tempInt % j;
                if(divisible != 0) {
                    //System.out.print(target + " Is Not a Multiple of " + tempInt + "\n");
                    target++;

                }
                target++;
                System.out.println(target + " is a multiple of " + tempInt + "\n");
            }


        }

        return target;
    };
}
