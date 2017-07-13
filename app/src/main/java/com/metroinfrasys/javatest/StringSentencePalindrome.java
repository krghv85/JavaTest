package com.metroinfrasys.javatest;

import java.util.Arrays;

/**
 * Created by Metro on 23-06-2017.
 */

public class StringSentencePalindrome {

    public static void main(String[] args) {
    int[] arr={1,4,21,53,13,454,13,43,53,5};
        Arrays.sort(arr);
        System.out.println("Max form arr : "+arr[0]);
        System.out.println("Max form arr : "+arr[arr.length-1]);

    }
}