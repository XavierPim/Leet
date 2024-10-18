#include <iostream>
#include "Solution.hpp"
using namespace std;

int main() {
    string s = "PAYPALISHIRING";
    int numRows = 3;
    Solution solution;
    cout<<solution.convert(s, numRows) <<endl;
}