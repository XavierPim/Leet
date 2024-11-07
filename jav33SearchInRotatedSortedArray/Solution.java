package jav33SearchInRotatedSortedArray;

public class Solution {

    public int search(int[] nums, int target) {
        return searchRecursive(nums, 0, nums.length - 1, target);
    }

    private int searchRecursive(int[] nums, int left, int right, int target) {
        // Base case: If the subarray is exhausted, return -1 (target not found)
        if (left > right) {
            return -1;
        }

        // Calculate the midpoint
        int mid = left + (right - left) / 2;

        // Check if the midpoint is the target
        if (nums[mid] == target) {
            return mid;
        }

        // Determine which side is sorted
        if (nums[left] <= nums[mid]) {
            // Left side is sorted
            if (nums[left] <= target && target < nums[mid]) {
                // Target is in the sorted left half
                return searchRecursive(nums, left, mid - 1, target);
            } else {
                // Target is in the right half
                return searchRecursive(nums, mid + 1, right, target);
            }
        } else {
            // Right side is sorted
            if (nums[mid] < target && target <= nums[right]) {
                // Target is in the sorted right half
                return searchRecursive(nums, mid + 1, right, target);
            } else {
                // Target is in the left half
                return searchRecursive(nums, left, mid - 1, target);
            }
        }
    }
}
