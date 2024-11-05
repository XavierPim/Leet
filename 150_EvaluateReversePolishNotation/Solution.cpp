
#include "Solution.hpp"

#include <stack>
#include <stdexcept>

int Solution::evalRPN(vector<string> &tokens) {
        stack<int> formulaStack;

        for (const std::string& token : tokens) {
            if (isOperator(token)) {
                if (formulaStack.size() < 2) {
                    throw std::invalid_argument("Insufficient operands for the operation");
                }

                int top = formulaStack.top();
                formulaStack.pop();
                int under = formulaStack.top();
                formulaStack.pop();

                // Perform operation and push the result back onto the stack
                formulaStack.push(performOperation(under, top, token[0]));
            } else {
                formulaStack.push(std::stoi(token));
            }
        }

        // Final result should be the only element left on the stack
        return formulaStack.empty() ? 0 : formulaStack.top();
    }

    bool Solution::isOperator(const std::string& token) {
        return token == "+" || token == "-" || token == "*" || token == "/";
    }

    int Solution::performOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;  // Integer division truncates towards zero
            default: throw std::invalid_argument("Unknown operator");
        }
    };
