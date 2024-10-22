#include "Solution.hpp"

int Solution::reverse(int x) {
    int32_t result = 0;
    while(x !=0 ) {
        int32_t finalDigit = x % 10;
        result = result * 10 + finalDigit;
        x /= 10;
    }
    return result;
}
