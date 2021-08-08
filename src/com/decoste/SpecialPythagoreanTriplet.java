package com.decoste;

public class SpecialPythagoreanTriplet {




    static void print() {
        double a = 3,
                b = 4;
        double[] dubArray = new double[500];
        double tempC = (a * a) + (b * b);
        double c = Math.sqrt(tempC);
        System.out.println("A is " + a + " B is " + b + " and C is " + c);

            for(int i = 0; i < dubArray.length - 1; i++) {
                a = dubArray[i];
                b = dubArray[i + 1];
                a++;
                b++;

                if(a + b + c == 1000) {
                    System.out.println("A is " + a + " B is " + b + " and C is " + c);
                }

            }



    }


}
