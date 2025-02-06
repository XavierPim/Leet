package jav647PalindromicSubstrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(i, i, s);
            count += expandFromCenter(i, i + 1, s);
        }
        return count;
    }

    int expandFromCenter(int left, int right, String s) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
