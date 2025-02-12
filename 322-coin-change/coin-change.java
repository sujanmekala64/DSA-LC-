class Solution {
    public int check(int n,int coins[],int target,int dp[][]){
        if(n==0){
            if(target%coins[n]==0) return target/coins[n];
            else return(int)(1e9);
        }
        if(dp[n][target]!=-1) return dp[n][target];
        int notinc = 0+check(n-1,coins,target,dp);
        int inc=Integer.MAX_VALUE;
        if(coins[n]<=target) inc=1+check(n,coins,target-coins[n],dp);
        return dp[n][target]=Math.min(notinc,inc);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=amount;j++) dp[i][j]=-1;
        }
        int ans = check(coins.length-1,coins,amount,dp);
        return ans==1e9?-1:ans;
    }
}