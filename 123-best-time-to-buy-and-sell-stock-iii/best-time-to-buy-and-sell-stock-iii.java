class Solution {
    public int check(int prices[],int idx,int buy,int maxi,int dp[][][]){
        if(maxi<=0) return 0;
        if(idx==prices.length-1){
            if(buy==1) return 0;
            else if(buy==0 && maxi>0) return prices[idx];
            else return 0;
        }
        if(dp[idx][buy][maxi]!=-1) return dp[idx][buy][maxi];
        if(buy==1){
            int buys = -prices[idx]+check(prices,idx+1,0,maxi,dp); //here we dont reduce maxi since total transaction is done when we sell stock
            int notbuys = check(prices,idx+1,1,maxi,dp);
            return dp[idx][buy][maxi]=Math.max(buys,notbuys);
        }
        else{
            int sell = 0;
            if(maxi>0) sell=prices[idx]+check(prices,idx+1,1,maxi-1,dp);
            int notsell = check(prices,idx+1,0,maxi,dp);
            return dp[idx][buy][maxi]=Math.max(sell,notsell);
        }
    }
    public int maxProfit(int[] prices) {
        int dp[][][] = new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++) for(int j=0;j<2;j++) for(int k=0;k<3;k++) dp[i][j][k]=-1;
        return check(prices,0,1,2,dp);
    }
}