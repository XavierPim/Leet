package jav73SetMatrixZeroes;

import java.util.Collections;
import java.util.TreeSet;

public class Solution {
    public static void setZeroes(int matrix[][]) {
        TreeSet<Integer> cols = new TreeSet<>();
        TreeSet<Integer> rows = new TreeSet<>();
        int isAllZero = 0;
        //go through matrix once - see if full coverage prior to completion to save time
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (matrix[m][n] == 0) {
                    rows.add(m);
                    cols.add(n);
                    if(rows.size() == matrix.length || cols.size() == matrix[m].length){
                        isAllZero = 1;
                        break;
                    }
                }
            }
        }
        System.out.println("Cols: " + cols +  " " + "Rows: " + rows);
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (isAllZero == 1 || rows.contains(m) || cols.contains(n)) {
                   matrix[m][n] = 0;
                }
            }
        }
    }
}
