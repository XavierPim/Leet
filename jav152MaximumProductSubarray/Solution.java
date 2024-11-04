package jav152MaximumProductSubarray;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
    for(int i = 1; i<nums.length;i++){
        int tempProd = nums[i];
        maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
        minProd = Math.min(nums[i], Math.max(tempProd * nums[i], minProd * nums[i]));

        result = Math.max(result, maxProd);
    }
    return result;
    }
}
