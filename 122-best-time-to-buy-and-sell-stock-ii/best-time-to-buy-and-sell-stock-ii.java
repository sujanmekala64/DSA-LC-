class Solution {
    public int check(int prices[],int idx,int buy,int dp[][]){
        if(idx==prices.length-1){
            if(buy==1) return prices[idx];
            else return 0;
        }
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==0){
            int buys = -prices[idx]+check(prices,idx+1,1,dp);
            int notbuys  = check(prices,idx+1,0,dp);
            return dp[idx][buy]=Math.max(buys,notbuys);
        }
        else{
            int sell = prices[idx]+check(prices,idx+1,0,dp);
            int dontsell = check(prices,idx+1,1,dp);
            return dp[idx][buy]=Math.max(sell,dontsell);
        }
    }
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        for(int i=0;i<prices.length;i++) for(int j=0;j<2;j++) dp[i][j]=-1;
        return check(prices,0,0,dp);
    }
}