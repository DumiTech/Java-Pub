package com.dumi.leetcode;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LCPSolution obj = new LCPSolution();
        String toPrint = obj.searchLongestCommonPrefix();
        System.out.println(toPrint);
    }
}

class LCPSolution {
//    String[] strs = {"flower","flow","flight"};
    String[] strs = {"a","aa"};
//    String[] strs = {"reflower","flow","flight"};
//    String[] strs = {"dog","racecar","car"};
//    String[] strs = {"c","acc","ccc"};
//    String[] strs = {"cir","car"};

    public String searchLongestCommonPrefix(){
        String longestPrefix="";
        int arraySize = strs.length;
        if (arraySize == 0) return "";
        int minSize = Integer.valueOf(strs[0].length());
        String min = strs[0];

        for (int i=0; i<arraySize; i++) {
            if (minSize > strs[i].length()) {
                minSize = Integer.valueOf(strs[i].length());
                min = strs[i];
            }
        }

        for (int i=0; i<minSize; i++) {
            int count = 0;
            for (String str : strs) {
                count++;
                if (min.charAt(i) != str.charAt(i)) {
                    return longestPrefix;
                }
                if (count == arraySize) longestPrefix+=min.charAt(i);
            }
        }

        return longestPrefix;
    }

}