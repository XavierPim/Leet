#include "Solution.hpp"
#include <iostream>

int main() {
    vector<int> nums = {1,2,3,4,1};
    Solution solution;
    cout<< "result: " << boolalpha<< solution.containsDuplicate(nums)<< endl;
    return 0;
}