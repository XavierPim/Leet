package jav300LongestIncreasingSubsequence;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums){
        if (nums.length == 0) return 0;

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLIS = 1;

        for (int i = 1; i < n; i++) {
            int right = nums[i];
            for (int j = 0; j < i; j++) {
            int left = nums[j];
                if (right > left) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }
}
