#include <iostream>
#include <string>
#include "Solution.hpp"
using namespace std;

int main() {
string s0 = "aa";
string s1 = "aa";
string s2 = "ab";

string p0="a";
string p1= "a*";
string p2=".*";

Solution solution;
cout<< solution.isMatch(s0,p0) << endl;

}