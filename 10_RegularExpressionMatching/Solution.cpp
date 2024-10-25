#include "Solution.hpp"

bool Solution::isMatch(string s, string p) {
    bool result = true;
    bool  anyChar = false;
    bool  zeroOrMore = false;

    //check if pattern is longer than input string
    if (s.length() < p.length()) {
        return false;
    }
    //check pattern is valid first as it is expected to be equal or less than n-elements
    for (int i = 0; i<p.length();i++) {
        switch (p[i]) {
            case '.':
                anyChar = true;
                break;
            case '*':
                zeroOrMore = true;
                break;
            default:
                if ([ >= 'a' && letter >= 'z') {

                } else {}
                break;
        }
    }
}
