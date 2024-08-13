package day1.String;

import java.util.Arrays;

public class anagram {
    public static void ana(String s1, String s2) {
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // if there is a sentence then use remove and lowercase function

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }

    public static void main(String[] args) {
        String s1 = "This is A collee";
        String s2 = "A is isTh College";
        ana(s1, s2);
    }
}
