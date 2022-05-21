class Solution {
  public int coinChange(int[] coins, int amount) {
    var len = coins.length;
    var dp = new int[amount+1];
    var max = amount +1;

    Arrays.fill(dp,max);

    dp[0] = 0;

    for( int i = 1; i < amount+1 ;i++){
      for( var coin : coins) {
        if( i-coin >= 0){
          dp[i] = Math.min(dp[i], dp[i-coin] +1);
        }
      }
    }
    if( dp[amount] == max){
      return -1;
    }else{
      return dp[amount];
    }
  }
}