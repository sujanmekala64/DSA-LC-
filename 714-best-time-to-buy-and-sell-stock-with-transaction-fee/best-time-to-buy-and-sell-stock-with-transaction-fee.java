class Solution {
    public int check(int prices[],int idx,int buy,int fee,int dp[][]){
        if(idx==prices.length-1){
            if(buy==1) return 0;
            else return prices[idx]-fee;
        }
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            int buys = -prices[idx]+check(prices,idx+1,0,fee,dp);
            int notbuys = check(prices,idx+1,1,fee,dp);
            return dp[idx][buy]=Math.max(buys,notbuys);
        }
        else{
            int sell = prices[idx]-fee+check(prices,idx+1,1,fee,dp);
            int notsell = check(prices,idx+1,0,fee,dp);
            return dp[idx][buy]=Math.max(sell,notsell);
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int dp[][] = new int[prices.length][2];
        for(int i=0;i<prices.length;i++) for(int j=0;j<2;j++) dp[i][j]=-1;
        return check(prices,0,1,fee,dp);
    }
}