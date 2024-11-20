package jav15ThreeSum;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(array);

        // Print the result triplets
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
