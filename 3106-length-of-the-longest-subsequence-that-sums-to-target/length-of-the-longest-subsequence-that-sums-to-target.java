class Solution {
    public int subsequence(List<Integer> nums,int idx,int target,int dp[][]){
        if(target==0) return 0;
        else if(target<0 || idx>=nums.size()) return Integer.MIN_VALUE;
        else if(dp[idx][target]!=-1) return dp[idx][target];
        int nottake = subsequence(nums,idx+1,target,dp);
        int take = 1+subsequence(nums,idx+1,target-nums.get(idx),dp);
        dp[idx][target]=Math.max(nottake,take);
        return dp[idx][target];
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][] = new int[nums.size()+1][target+1];
        for(int i=0;i<=nums.size();i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        int ans = subsequence(nums,0,target,dp);
        if(ans<0) return -1;
        return ans;
    }
}