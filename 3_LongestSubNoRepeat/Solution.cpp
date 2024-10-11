#include "Solution.hpp"
#include <unordered_set>

int Solution::longestSubsequenceNoRepeat(string s) {
    unordered_set<char> substring;
    int maxLength = 0;
    int index = 0;
    for (int next = 0; next < s.length(); ++next) {
        while (substring.find(s[next]) != substring.end()) {
            substring.erase(s[index]);
            index++;
        }
        substring.insert(s[next]);
        maxLength = std::max(maxLength, next - index + 1);
    }
    return maxLength;
}


