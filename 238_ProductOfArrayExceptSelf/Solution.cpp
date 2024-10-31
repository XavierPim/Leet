#include "Solution.hpp"

// 1. ITERATIVE APPROACH
 vector<int> Solution::productExceptSelf(vector<int> &nums) {
     vector answer(nums.size(), 0);
     int hasZeroCount = 0;
     int32_t totalProduct = 1;

     // get every sum
     for (int num: nums) {
         if (num == 0) {
             hasZeroCount++;
         } else {
             totalProduct *= num;
         }
     }

     //if more than one zero elements
     if (hasZeroCount > 1) {
         return answer;
     }

     // Fill the answer vector based on the zero count
     for (int i = 0; i < nums.size(); ++i) {
         if (nums[i] == 0) {
             answer[i] = totalProduct; // For a single zero, only this position gets total product
         } else if (hasZeroCount == 0) {
             answer[i] = totalProduct / nums[i]; // No zero in nums, so standard division
         } else {
             answer[i] = 0; // For non-zero elements when there is exactly one zero
         }
     }
     return answer;
 }
