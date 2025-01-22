package jav54SpiralMatrix;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[][]  matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Solution solution = new Solution();
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }
}
