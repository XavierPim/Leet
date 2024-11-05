#ifndef SOLUTION_HPP
#define SOLUTION_HPP
#include <vector>
#include <string>
using namespace std;
class Solution {
public:
int evalRPN(vector<string>&tokens);

bool isOperator(const std::string &token);

int performOperation(int a, int b, char op);
};


#endif
