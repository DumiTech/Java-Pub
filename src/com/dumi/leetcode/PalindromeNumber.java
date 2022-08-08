package com.dumi.leetcode;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
* */

public class PalindromeNumber {

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(1));
    }
}

class Palindrome {
    public boolean isPalindrome(int x) {

        // Declaring a temporary variable to keep x unmodified
        int temp = x;
        int reversedNumber = 0;

        while (temp > 0) {
            // Moving last digit to it's correct base position in reversedNumber and
            // Extracting last digit from temp
            reversedNumber = reversedNumber * 10 + temp % 10;
            // Removing last digit from temp
            temp = temp/10;
        }
        return x == reversedNumber;
    }
}