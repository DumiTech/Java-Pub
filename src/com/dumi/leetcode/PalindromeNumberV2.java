package com.dumi.leetcode;

public class PalindromeNumberV2 {
    public static void main(String[] args) {
        PalindromeV2 obj = new PalindromeV2();
        System.out.println(obj.isPalindrome(10001));
    }
}

class PalindromeV2 {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }

        return (x == reversedNumber || x == reversedNumber / 10);
    }
}
