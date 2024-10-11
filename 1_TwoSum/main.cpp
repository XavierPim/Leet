    #include <iostream>
#include <vector>
#include "Solution.hpp"

int main() {
    std::vector<int> nums{1, 2, 3, 4, 5};
    int target = 7;
    std::vector<int> result = Solution().twoSum(nums, target);
    std::cout << "[" << result[0] << ", " << result[1] << "]" << std::endl;
    return 0;
}
