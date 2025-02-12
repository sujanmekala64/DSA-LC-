class Solution {
    public int check(int prices[],int idx,int buy,int cooldown,int dp[][]){
        if(cooldown==-1) return check(prices,idx+1,1,0,dp);
        if(idx>prices.length-1) return 0;
        if(idx==prices.length-1){
            if(buy==1) return 0;
            else return prices[idx];
        }
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            int buys = -prices[idx]+check(prices,idx+1,0,0,dp);
            int dontbuys = check(prices,idx+1,1,0,dp);
            return dp[idx][buy]=Math.max(buys,dontbuys);
        }
        else{
            int sell = 0;
            if(idx<prices.length-1) sell=prices[idx]+check(prices,idx+1,1,-1,dp);
            int dontsell = check(prices,idx+1,0,0,dp);
            return dp[idx][buy]=Math.max(sell,dontsell);
        }
    }
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        for(int i=0;i<prices.length;i++) for(int j=0;j<2;j++) dp[i][j]=-1;
        return check(prices,0,1,0,dp);
    }
}