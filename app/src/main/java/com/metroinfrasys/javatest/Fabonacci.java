package com.metroinfrasys.javatest;

/**
 * Created by Metro on 15-06-2017.
 */

public class Fabonacci {
    public static void main(String s[]) {
        int n1 = 0, n2 = 1, n3, a = 10;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < a; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }
    }
}
