package jav322CoinChange;
import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Base case: 0 coins needed for amount 0

        for (int i = 1; i <= amount; i++) { // Iterate over amounts
            for (int coin : coins) { // Try each coin
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
    }
}

//SLOW Recusive memoization
//public class Solution {
//    public int coinChange(int[] coins, int amount) {
//        Arrays.sort(coins); // Sort so largest coins are at the end
//        int[] memoizationArr = new int[amount + 1];
//        Arrays.fill(memoizationArr, -1);
//        int result = coinChangeHelper(coins, amount, memoizationArr);
//        return (result == Integer.MAX_VALUE) ? -1 : result; // Convert impossible cases to -1
//    }
//
//    private int coinChangeHelper(int[] coins, int amount, int[] memoizationArr) {
//        if (amount == 0) return 0; // No coins needed
//        if (amount < 0) return Integer.MAX_VALUE; // Impossible case
//
//        if (memoizationArr[amount] != -1) return memoizationArr[amount];
//
//        int minCoins = Integer.MAX_VALUE;
//        for (int i = coins.length - 1; i >= 0; i--) { // Start from largest coin
//            int res = coinChangeHelper(coins, amount - coins[i], memoizationArr);
//            if (res != Integer.MAX_VALUE && res + 1 > 0) { // Prevent overflow
//                minCoins = Math.min(minCoins, res + 1);
//            }
//        }
//
//        memoizationArr[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
//        return memoizationArr[amount];
//    }
//}
