#include "Solution.hpp"
#include <vector>
using namespace std;


string Solution::convert(string s, int numRows) {
    if(numRows == 1) {
        return s;
    }
    vector<string> rows(min(numRows, static_cast<int>(s.length())));
    int currRow = 0;
    bool goingDown = false;
    for(char c: s) {
        rows[currRow] += c;

        if(currRow == 0 ) {
            goingDown = true;
        } else if(currRow == numRows-1) {
            goingDown = false;
        }

        currRow += goingDown?1:-1;
    }
    string result;
    for(string row : rows) {
        result += row;
    }
    return result;
}