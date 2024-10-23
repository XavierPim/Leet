#include "Solution.hpp"
#include <cstdint>

int Solution::myAtoi(string s) {
            int32_t result = 0;
            int sign = 1;
            int signCount = 0;
            int start = 0;

            while(s[start]==' ' || s[start] == '-' || s[start]== '+'){
                if(s[start] == '-'){
                    sign = -1;
                    ++signCount;
                } else if (s[start] == '+'){
                    ++signCount;
                }
                //edge case "+-12"
                if(signCount > 1 ){
                    return result;
                }
                //edge case "  +  403"
                if(signCount > 0  && s[start] == ' ') {
                return result;
                }
                ++start;
            }

            for (int i = start; i < s.length(); ++i) {
                char curr = s[i];
                if (curr >= '0' && curr <= '9') {
                    int digit = curr - '0';

                    if (result > (std::numeric_limits<int32_t>::max() - digit) / 10) {
                        return (sign == 1) ? numeric_limits<int32_t>::max() : numeric_limits<int32_t>::min();
                    }

                    result = result * 10 + digit;
                } else {
                    break;
                }
            }

            return result * sign;
        }
