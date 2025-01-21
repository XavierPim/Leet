package jav73SetMatrixZeroes;

public class Main {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        Solution solution = new Solution();
        solution.setZeroes(matrix);
        for(int[] row : matrix){
            for(int val : row){
                System.out.print( val + " ");
            }
            System.out.println();
        }
    }
}
