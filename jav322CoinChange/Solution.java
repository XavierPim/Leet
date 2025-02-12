package jav322CoinChange;
import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins); // sorts so larges are at the back end
        int[] memoizationArr = new int[amount + 1];
        Arrays.fill(memoizationArr, -1);
        return coinChangeHelper(coins, amount, memoizationArr);
    }

    private int coinChangeHelper(int[] coins, int amount, int[] memoizationArr) {
        if (amount == 0) return 0; // No coins needed
        if (amount < 0) return Integer.MAX_VALUE; // Impossible case

        if (memoizationArr[amount] != -1) return memoizationArr[amount];

        int minCoins = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) { // Start from largest coin
            int res = coinChangeHelper(coins, amount - coins[i], memoizationArr);
            if (res != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, res + 1);
            }
        }

        memoizationArr[amount] = minCoins;
        return memoizationArr[amount];
    }
}
