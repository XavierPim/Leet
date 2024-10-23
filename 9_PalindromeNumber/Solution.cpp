
#include "Solution.hpp"
#include <cmath>
bool Solution::isPalindrome(int x)  {
    int length = floor(log10(x))+ 1;
    bool result = true;
    for(int i = 0; i < length/2; ++i) {
            int leastSig = (x/static_cast<int>(pow(10,0))) % 10;
            int mostSig = (x/static_cast<int>(pow(10, length - 1 - i))) %10;
        if(leastSig != mostSig) {
            result =false;
            break;
        }
            }
return result;
}

