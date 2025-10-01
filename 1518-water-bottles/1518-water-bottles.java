class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int val=numBottles/numExchange;
            ans+=val;
            numBottles=val+(numBottles%numExchange);
        }
        return ans;
    }
}