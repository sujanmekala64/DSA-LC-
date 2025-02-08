class Solution {
    public int check(int prices[],int idx,int buy,int k,int dp[][][]){
        if(k<0) return 0;
        if(idx==prices.length-1){
            if(buy==1) return 0;
            else if(buy==0 && k>0) return prices[idx];
            else return 0;
        }
        if(dp[idx][buy][k]!=-1) return dp[idx][buy][k];
        if(buy==1){
            int buys = -prices[idx]+check(prices,idx+1,0,k,dp);
            int notbuy = check(prices,idx+1,1,k,dp);
            return dp[idx][buy][k]=Math.max(buys,notbuy);
        }
        else{
            int sell=0;
            if(k>0) sell=prices[idx]+check(prices,idx+1,1,k-1,dp);
            int notsell = check(prices,idx+1,0,k,dp);
            return dp[idx][buy][k]=Math.max(sell,notsell);
        }
    }
    public int maxProfit(int k, int[] prices) {
        int dp[][][] = new int[prices.length][2][k+1];
        for(int i=0;i<prices.length;i++) for(int j=0;j<2;j++) for(int f=0;f<=k;f++) dp[i][j][f]=-1;
        return check(prices,0,1,k,dp);
    }
}