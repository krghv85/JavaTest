package com.metroinfrasys.javatest.arrays;

/**
 * Created by Metro on 15-06-2017.
 */

public class MaxMinArray {
    public static void main(String ss[]) {
        int[] a = {5, 8, 9, 2, 6, 21, 3, 8};
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("MAX : "+max);
        System.out.print("\n MIN : "+min);

    }
}
