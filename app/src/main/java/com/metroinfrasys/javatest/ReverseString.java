package com.metroinfrasys.javatest;

/**
 * Created by Metro on 15-06-2017.
 */

public class ReverseString {
    public static void main(String ss[]) {
        String s="aba";
        String rev="";

        for (int i=s.length()-1;i>=0;i--)
        {
//            rev=rev.concat(String.valueOf(s.charAt(i)));
            rev=rev+s.charAt(i);
        }
//        System.out.print(rev);
        if (rev.contains(s))
        {
            System.out.print("String is Palindrome");
        }else {
            System.out.print("String is not Palindrome");

        }

    }
}
