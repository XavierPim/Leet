package jav76MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        // Edge case: If t is longer than s, no valid window can exist
        if (s.length() < t.length()) {
            return "";
        }

        // Create the frequency map for characters in t
        Map<Character, Integer> t_map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            t_map.put(ch, t_map.getOrDefault(ch, 0) + 1);
        }

        // Sliding window pointers and variables
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, startIndex = 0;
        int required = t_map.size(); // Number of unique characters to match
        int formed = 0; // Tracks how many characters satisfy the condition

        // Window frequency map
        Map<Character, Integer> window_map = new HashMap<>();

        // Expand the window
        while (right < s.length()) {
            char ch = s.charAt(right);
            window_map.put(ch, window_map.getOrDefault(ch, 0) + 1);

            // Check if the current character satisfies t_map
            if (t_map.containsKey(ch) && window_map.get(ch).intValue() == t_map.get(ch).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left
            while (left <= right && formed == required) {
                char temp = s.charAt(left);

                // Update the result if the current window is smaller
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                // Remove the leftmost character from the window
                window_map.put(temp, window_map.get(temp) - 1);
                if (t_map.containsKey(temp) && window_map.get(temp).intValue() < t_map.get(temp).intValue()) {
                    formed--;
                }

                left++;
            }

            // Expand the window
            right++;
        }

        // Return the smallest window or an empty string if no valid window exists
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
}
