package jav53maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int compareSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //check if this subarray is higher sum
            compareSum = Math.max(nums[i], compareSum + nums[i]);
            // init whichever is larger
            maxSum = Math.max(maxSum, compareSum);
        }
        return maxSum;
    }
}
