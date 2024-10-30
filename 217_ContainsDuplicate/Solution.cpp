#include "Solution.hpp"
#include <unordered_set>

bool Solution::containsDuplicate(vector<int> &nums) {
    unordered_set<int> seen;
    for(int num:nums){
        if(seen.find(num)!=seen.end()) {
            return true;
        }
        seen.insert(num);
    }
    return false;
}
