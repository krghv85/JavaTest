package com.metroinfrasys.javatest;

public class Diamond {
    public static void main(String s[]) {

        for (int i=1;i<=5;i++) {
            for (int j=i;j<=5;j++) {
            System.out.print(" ");
            }
            for (int k=1;k<(2*i);k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i=4;i>=1;i--) {
            for (int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<(2*i);k++) {
                System.out.print("*");
            }
            System.out.println();
        }











   /*     for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");

            }
            System.out.println();

        }*/
    }
}
