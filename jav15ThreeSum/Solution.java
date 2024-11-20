package jav15ThreeSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triples = new ArrayList<>();

        quickSort(nums, 0, nums.length - 1);

        // Iterate over each pivot
        for (int pivot = 0; pivot < nums.length - 2; pivot++) {
            // Skip duplicate values for the pivot
            if (pivot > 0 && nums[pivot] == nums[pivot - 1]) {
                continue;
            }

            // Two-pointer approach
            int left = pivot + 1;
            int right = nums.length - 1;

            while (left < right) {
                int tempSum = nums[pivot] + nums[left] + nums[right];

                if (tempSum == 0) {
                    // Found a triplet
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[pivot]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    triples.add(triplet);

                    // Skip duplicates for `left` and `right`
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward
                    left++;
                    right--;
                } else if (tempSum < 0) {
                    // If sum is too small, increment `left`
                    left++;
                } else {
                    // If sum is too large, decrement `right`
                    right--;
                }
            }
        }

        return triples;
    }


    private int partitioner(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partitioner(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
}
