package RecursionAndDynamicProgramming;

public class Coins {

    public int coins(int amount, int[] coins) {
        if(amount == 0)return 1;
        int[] dp = new int[amount+1];
        dp[0] = 1;

        for(int i=0; i<coins.length; i++) {
            for(int j=coins[i]; j<amount+1; j++) {
                dp[j] +=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
