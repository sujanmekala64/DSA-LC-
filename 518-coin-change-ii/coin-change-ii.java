class Solution {
    public int check(int n,int coins[],int amount,int dp[][]){
        // if(n==0){
        //     if(amount%coins[0]==0) return 1;
        //     return 0;
        // }
        // if(dp[n][amount]!=-1) return dp[n][amount];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int notinc = dp[i-1][j];
                int inc=0;
                if(coins[i]<=j) inc=dp[i][j-coins[i]];
                dp[i][j]=(inc+notinc);
            }
        }
        return dp[n-1][amount];
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount+1];
        // for(int i=0;i<coins.length;i++){
        //     for(int j=0;j<=amount;j++) dp[i][j]=-1;
        // }
        return check(coins.length,coins,amount,dp);
    }
}