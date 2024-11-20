package jav11ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        // Initialize two pointers
        int left = 0;
        int right = height.length - 1;

        // Variable to store the maximum area
        int maxArea = 0;

        // Iterate until the two pointers meet
        while (left < right) {
            // Calculate the current area
            int tempArea = Math.min(height[left], height[right]) * (right - left);
            // Update maxArea if the current area is larger
            maxArea = Math.max(tempArea, maxArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area found
        return maxArea;
    }
}
