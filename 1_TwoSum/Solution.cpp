#include "Solution.hpp"

#include <unordered_map>
//Brute Force
// std::vector<int> Solution::twoSum(std::vector<int>& nums, int target) {
//     std::vector<int> result;
//     int len = nums.size();
//     for(int i = 0; i < len; i++) {
//         for(int j = i + 1; j < len; j++) {
//             if(target == nums[i] + nums[j]) {
//                 result.push_back(i);
//                 result.push_back(j);
//                 return result;
//             }
//         }
//     }
//     return result;
// }

//Hashing Solution
std::vector<int> Solution::twoSum(std::vector<int>& nums, int target) {
    std::unordered_map<int, int> numMap;
    for(int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        if(numMap.find(complement)!= numMap.end()) {
            return {numMap[complement], i};
        }
        numMap[nums[i]] = i;
    }
    return {};
}
