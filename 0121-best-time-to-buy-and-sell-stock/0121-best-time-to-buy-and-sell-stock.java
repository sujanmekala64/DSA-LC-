class Solution {
    public int maxProfit(int[] prices) {
       int buy=Integer.MAX_VALUE;
       int ans=0;
       for(int i=0;i<prices.length;i++){
            if(prices[i]<buy) buy=prices[i];
            if((prices[i]-buy)>ans) ans=prices[i]-buy;
       } 
       return ans;
    }
}