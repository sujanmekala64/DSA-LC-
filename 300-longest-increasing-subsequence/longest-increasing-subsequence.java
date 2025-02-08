class Solution {
    public int check(int nums[],int idx,int prev_idx,int dp[][]){
        // if(idx==nums.length-1){
        //     if(prev_idx!=-1 && nums[idx]>nums[prev_idx]) return 1;
        //     else return 0;
        // }
        for(int i=nums.length-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                int len = 0+dp[i+1][prev+1];
                if(prev==-1 || nums[i]>nums[prev]){
                    len=Math.max(len,1+dp[i+1][i+1]);
                }
                dp[i][prev+1]=len;
            }
        }
        return dp[0][-1+1];
        // if(dp[idx][prev_idx+1]!=-1) return dp[idx][prev_idx+1];
        // int notinc = 0+check(nums,idx+1,prev_idx,dp);
        // int inc=0;
        // if(prev_idx==-1 || nums[idx]>nums[prev_idx]) inc = 1+check(nums,idx+1,idx,dp);
        // return dp[idx][prev_idx+1]=Math.max(notinc,inc);
    }
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1) return 1;
        int dp[][] = new int[nums.length+1][nums.length+1];
        // for(int i=0;i<nums.length;i++) for(int j=0;j<=nums.length;j++) dp[i][j]=-1;
        return check(nums,0,-1,dp);
    }
}