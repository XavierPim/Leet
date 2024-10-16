#include "Solution.hpp"

#include <string>
using namespace std;

    string Solution::longestPalindrome(string s) {
        if (s.empty()) return "";

        int start = 0, maxLength = 1; // To store the starting index and max length of palindrome

        for (int i = 0; i < s.length(); ++i) {
            // Odd length palindromes (single character center)
            int len1 = expandAroundCenter(s, i, i);
            // Even length palindromes (two characters center)
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (maxLength - 1) / 2; // Calculate the start index
            }
        }

        return s.substr(start, maxLength); // Return the longest palindrome substring
    }

    int Solution::expandAroundCenter(const string &s, int left, int right) {
        while (left >= 0 && right < s.length() && s[left] == s[right]) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

