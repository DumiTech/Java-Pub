package com.dumi.leetcode;

public class LongestCommonPrefixV2 {
    public static void main(String[] args) {
        LCPSolutionV2 obj = new LCPSolutionV2();
        String toPrint = obj.searchLongestCommonPrefix();
        System.out.println(toPrint);
    }
}

class LCPSolutionV2 {
//    String[] strs = {"flower","flow","flight"};
//    String[] strs = {"a","aa"};
//    String[] strs = {"reflower","flow","flight"};
//    String[] strs = {"dog","racecar","car"};
    String[] strs = {"c","acc","ccc"};
//    String[] strs = {"cir","car"};

    public String searchLongestCommonPrefix(){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}