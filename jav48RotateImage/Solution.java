package jav48RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int leftBound = 0;
        int rightBound = matrix.length - 1;

        while (leftBound < rightBound) {
            for (int i = 0; i < (rightBound - leftBound); i++) {
                int top = leftBound;
                int bottom = rightBound;

                // Save the top-left element
                int topLeft = matrix[top][leftBound + i];

                // Move bottom-left to top-left
                matrix[top][leftBound + i] = matrix[bottom - i][leftBound];

                // Move bottom-right to bottom-left
                matrix[bottom - i][leftBound] = matrix[bottom][rightBound - i];

                // Move top-right to bottom-right
                matrix[bottom][rightBound - i] = matrix[top + i][rightBound];

                // Move top-left to top-right
                matrix[top + i][rightBound] = topLeft;
            }

            // Shrink the layer boundaries after completing a rotation for the current layer
            leftBound++;
            rightBound--;
        }
    }
}
