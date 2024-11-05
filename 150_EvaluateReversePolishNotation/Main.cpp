#include "Solution.hpp"
#include <iostream>
using namespace std;
int main() {
    Solution solution;

    // Example RPN expression: ["2", "1", "+", "3", "*"]
    std::vector<std::string> tokens1 = {"2", "1", "+", "3", "*"};
    std::cout << "Result of RPN expression {2, 1, +, 3, *} is: "
              << solution.evalRPN(tokens1) << std::endl;

    // Another example: ["4", "13", "5", "/", "+"]
    std::vector<std::string> tokens2 = {"4", "13", "5", "/", "+"};
    std::cout << "Result of RPN expression {4, 13, 5, /, +} is: "
              << solution.evalRPN(tokens2) << std::endl;

    // Complex example with negatives: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
    std::vector<std::string> tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    std::cout << "Result of complex RPN expression is: "
              << solution.evalRPN(tokens3) << std::endl;

    return 0;
}