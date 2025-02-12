package jav322CoinChange;

public class Main {
public static void main(String[] args){
    int[] coins = {1,2,5};
    int amount = 11;
    Solution solution = new Solution();
    System.out.println(solution.coinChange(coins, amount));
}
}
