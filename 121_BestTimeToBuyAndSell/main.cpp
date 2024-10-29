#include "Solution.hpp"
#include <vector>
#include <iostream>
using namespace std;
int main() {
    Solution solution;
    vector<int> prices = {7,1,5,3,6,4};
    vector<int> prices1= {2,4,1};
cout<< "best price: "<< solution.maxProfit(prices1);
    return 0;
}