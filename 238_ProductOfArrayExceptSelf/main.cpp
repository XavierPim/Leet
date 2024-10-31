#include <iostream>
#include "Solution.hpp"
using namespace std;

int main() {
    vector<int> nums1 = {1,2,3,4};
    vector<int> nums2 = {-1,1,0,-3,3};
    vector<int> nums3 = {0,2,3,4};
    Solution solution;
vector<int32_t> answer = solution.productExceptSelf(nums3);
    for(int i: answer) {
        cout<< i << " ";
    }
    return 0;
}