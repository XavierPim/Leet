
#include <string>
#include <vector>
#pragma once

using namespace std;

class Solution {
public:
    bool isMatch(string s, string p);
    bool recursive(string s, string p, int i, int j, vector<vector<int>>& memo);
};
