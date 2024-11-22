package jav371SumOfTwoIntegers;

public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;//adds without carry
            b = carry << 1;// shifts carry by one
        }
        return a;
    }
}
