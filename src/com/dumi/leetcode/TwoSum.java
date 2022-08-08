package com.dumi.leetcode;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        sol.twoSum(nums, target);
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.println(String.format("[%s, %s]", i, j));
                    return answer;
                }
            }
        }
        return null;
    }
}