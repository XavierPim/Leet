package jav54SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns

        // Define the boundaries of the matrix
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        // Traverse the matrix in a spiral order
        while (top <= bottom && left <= right) {
            // 1. Traverse from left to right along the top boundary
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++; // Move the top boundary down

            // 2. Traverse from top to bottom along the right boundary
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--; // Move the right boundary left

            // 3. Traverse from right to left along the bottom boundary (if still within bounds)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--; // Move the bottom boundary up
            }

            // 4. Traverse from bottom to top along the left boundary (if still within bounds)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++; // Move the left boundary right
            }
        }

        return result;
    }
}
