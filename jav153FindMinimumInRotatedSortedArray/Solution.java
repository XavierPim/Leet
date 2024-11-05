package jav153FindMinimumInRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        return findMinRecursive(nums, 0, nums.length - 1);
    }

    private int findMinRecursive(int[] nums, int left, int right) {
        // Base case: If there's only one element left, it’s the minimum.
        if (left == right) {
            return nums[left];
        }

        // If the array is already sorted, return the first element.
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        // Find the middle element.
        int mid = left + (right - left) / 2;

        // Check if mid is the minimum (rotation point).
        // Ensure `mid` is greater than `left` before accessing `nums[mid - 1]`.
        if (mid > left && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }

        // Check if the element at `mid + 1` is the minimum to avoid missing the pivot.
        if (mid < right && nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
        }

        // If `nums[mid]` is greater than `nums[right]`, the minimum is in the right half.
        if (nums[mid] > nums[right]) {
            return findMinRecursive(nums, mid + 1, right);
        } else {
            // Otherwise, search in the left half.
            return findMinRecursive(nums, left, mid);
        }
    }
}
