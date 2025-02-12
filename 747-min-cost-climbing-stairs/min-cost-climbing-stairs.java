class Solution {
    int solve(int cost[],int n){
        int prev1 = cost[1];
        int prev2 = cost[0];
        for(int i=2;i<n;i++){
            int curr = cost[i]+Math.min(prev1,prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev1,prev2);
    }
    public int minCostClimbingStairs(int[] cost) {
        return solve(cost,cost.length);
    }
}