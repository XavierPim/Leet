package jav347TopKFrequenElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.topKFrequent(nums, k)));

    }
}
