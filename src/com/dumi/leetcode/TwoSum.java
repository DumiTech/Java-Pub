package com.dumi;

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

        int size = nums.length;
        int[] answer = new int[2];
        int count = 0;

        while (count < size && nums[count] <= size) {
            int temp = nums[count] + nums[count+1];
            if (temp == target) {
                System.out.println(String.format("[%s, %s]", count, count+1));
                answer[0] = count;
                answer[1] = count+1;
                return answer;
            }
            count++;
        }
        return null;

    }
}