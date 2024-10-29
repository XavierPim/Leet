#include "Solution.hpp"

int Solution::maxProfit(vector<int> &prices) {
    if (prices.empty()) {
        return 0;
    }
    int smallest = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.size(); ++i) {
    //smallest price to buy
    smallest = min(smallest,prices[i]);
    int profit = prices[i]-smallest;
        maxProfit = max(maxProfit, profit);
    }
    return maxProfit;
}
