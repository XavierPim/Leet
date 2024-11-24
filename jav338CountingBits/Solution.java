package jav338CountingBits;

public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];//init an array that is n + 1 length and each element is 0

        //goal is to get the number of ones
        for (int i = 1; i < n + 1; i++) {
            //using previous value of result we can just add in the count if any 1 bits
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
