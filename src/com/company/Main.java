package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Army";
        String s2 = "Mary";
        if(isAnagram(s1, s2)) {
            System.out.println("It is Anargam");
        }
        else {
            System.out.println("It is not Anargam");
        }

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] t1 = s1.toCharArray();
        Arrays.sort(t1);

        char[] t2 = s2.toCharArray();
        Arrays.sort(t2);

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != t2[i])
                return false;
        }
        return true;
    }
}
