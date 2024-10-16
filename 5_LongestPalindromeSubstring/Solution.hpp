#ifndef SOLUTION_H
#define SOLUTION_H
#include <string>

class Solution {
public:
    std::string longestPalindrome(std::string s);
private:
    int expandAroundCenter(const std::string &s, int left, int right);
};

#endif //SOLUTION_H
