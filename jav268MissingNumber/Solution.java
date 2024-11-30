package jav268MissingNumber;

public class Solution {
    public int missingNumber(int[] nums){
        int xorRange = 0;
        for(int i = 0; i <= nums.length; i++){
            xorRange = xorRange ^ i;
        }
        int xorNums = 0;
        for(int num : nums){
        xorNums = xorNums ^ num;
        }
        return xorRange ^ xorNums;
    }
}
