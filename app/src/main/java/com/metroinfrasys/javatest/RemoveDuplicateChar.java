package com.metroinfrasys.javatest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Metro on 29-05-2017.
 */

public class RemoveDuplicateChar {
    public static void main(String ss[]) {
        StringBuilder sb =new StringBuilder();
//        String str="aabbbccddee";

        String s = "aabbbccddee";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break; //don't need to iterate further
                }
            }
            if (found == false) {
                s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(s2);



     /*   char[] ch =str.toCharArray();
        Set<Character> charSet=new HashSet<>();
        for (char c : ch)
        {
            charSet.add(c);
        }
        for (Character character : charSet)
        {
            sb.append(character);
        }
        System.out.println(sb.toString());*/

    }
}
