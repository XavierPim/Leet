package jav190ReverseBits;

public class Solution {
    public int reverseBits(int n){
    int reversed = 0;
    for(int i = 0; i < 32; i++){
        int currentBit = n & 1;// get current bit

        reversed = reversed << 1; //this makes space for the current bit by shifting left ward

        reversed = reversed | currentBit;// appends the LSB from n to this binary

        n = n>>1; //shifts all binary right replacing LSB with adjacent left bit.

        //each step the n binary shifts right and the reversed binary  shifts left
    }
        return reversed;
    }
}
