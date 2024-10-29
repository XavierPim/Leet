#include <iostream>
#include <string>
#include <vector>
#include "Solution.hpp"
using namespace std;

int main() {
    Solution solution;
    vector<string> sList = {"abc", "abc", "abc", "aab", "", "mississippi"};
    vector<string> pList = {"abc", "a.c", "a*b*c", "a*b*c", "", "mis*is*p*."};

    for (size_t i = 0; i < sList.size(); ++i) {
        bool result = solution.isMatch(sList[i], pList[i]);
        std::cout << "s: " << sList[i] << ", p: " << pList[i]
                  << " -> " << (result ? "true" : "false") << std::endl;
    }

    return 0;
}