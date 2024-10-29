#include "Solution.hpp"

bool Solution::isMatch(string s, string p) {
    int m = s.length();
    int n = p.length();
    vector<vector<int>> memo(m + 1, vector<int>(n + 1, -1)); // Initialize memoization table
    return recursive(s, p, 0, 0, memo);
}

bool Solution::recursive(string s, string p, int i, int j, vector<vector<int>>& memo) {
    // Check if we've already computed this state
    if (memo[i][j] != -1) return memo[i][j];

    // Base case if pattern is null
    if (j == p.length()) {
        return i == s.length();
    }

    // Check if it's *
    bool isStar = (j + 1 < p.length() && p[j + 1] == '*');

    if (isStar) {
        // Case where * is found
        if (recursive(s, p, i, j + 2, memo)) {
            return memo[i][j] = true;
        }
        if (i < s.length() && (s[i] == p[j] || p[j] == '.')) {
            return memo[i][j] = recursive(s, p, i + 1, j, memo);
        }
    } else {
        // General case for all letters and "."
        if (i < s.length() && (s[i] == p[j] || p[j] == '.')) {
            return memo[i][j] = recursive(s, p, i + 1, j + 1, memo);
        }
    }
    return memo[i][j] = false;
}


