package jav48RotateImage;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Solution solution = new Solution();
        solution.rotate(matrix);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
    }
}
