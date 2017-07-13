package com.metroinfrasys.javatest;

import java.util.StringTokenizer;

public class SplitString {
    public static void main(String ss[]) {
    String s="Android#Java#Php#Nodejs";

        String delim="#";
        StringTokenizer stringTokenizer=new StringTokenizer(s,delim);
        while (stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
