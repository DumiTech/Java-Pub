package com.dumi.leetcode;

import java.util.Arrays;

public class LongestCommonPrefixV3 {
    public static void main(String[] args) {
        LCPSolutionV3 obj = new LCPSolutionV3();
        String toPrint = obj.searchLongestCommonPrefix();
        System.out.println(toPrint);
    }
}

class LCPSolutionV3 {
//    String[] strs = {"flower","flow","flight"};
//    String[] strs = {"a","aa"};
//    String[] strs = {"reflower","flow","flight"};
//    String[] strs = {"dog","racecar","car"};
//    String[] strs = {"c","acc","ccc"};
    String[] strs = {"cir","car"};

    public String searchLongestCommonPrefix(){
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String min = strs[0];
        String max = strs[strs.length-1];
        int count = 0;
        while (count < min.length() && min.charAt(count) == max.charAt(count)) count++;
        return count == 0 ? "" : min.substring(0, count);
    }
}