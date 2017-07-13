package com.metroinfrasys.javatest.arrays;

/**
 * Created by Metro on 29-05-2017.
 */

public class FindMinPositive {
    public static void main(String s[]) {


        System.out.println(getValue());

    }

    private static int getValue() {
        int array[] = {8,7,0,5,-3,2,0,9};
        int smallestPositive = array[0];

        for(int i = 1; i < array.length; i++){
            if(smallestPositive > 0){
                if(array[i] < smallestPositive && array[i] > 0)
                    smallestPositive = array[i];
            }else {
                smallestPositive = array[i];
            }
        }
        return smallestPositive;
    }
}
