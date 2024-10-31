#ifndef SOLUTION_HPP
#define SOLUTION_HPP
#include <vector>
#include <iostream>
#include <cstdint>
using namespace std;
class Solution {
public:
    vector<int> productExceptSelf(vector<int>&nums);

    void recursiveApproach(const vector<int> &nums, vector<int> &answer, int &zeroCount, int32_t &totalProduct, int index);
};
#endif