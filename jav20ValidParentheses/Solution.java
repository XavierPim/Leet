package jav20ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // Use a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char ch : s.toCharArray()) {
            switch (ch) {
                // Push opening brackets onto the stack
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;

                // Check for matching closing brackets
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;

                // Invalid character
                default:
                    return false;
            }
        }

        // Stack should be empty if all parentheses are matched
        return stack.isEmpty();
    }
}
