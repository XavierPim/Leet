package jav424LongestRepeatingCharacterReplacement;

public class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int left = 0;
        int maxLength = 0;        // Result: max length of a valid window

        for (int right = 0; right < s.length(); right++) {
            // Increment frequency for the current character
            freq[s.charAt(right) - 'A']++;

            // Update the maximum frequency of any single character in the window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // If the window is invalid, shrink it by moving the left pointer
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--; // Decrement frequency for the character at the left
                left++; // Move the left pointer to shrink the window
            }

            // Update the max length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
