class Solution {
    public boolean check(int n,int sum,int nums[],boolean dp[][]){
        for(int i=0;i<n;i++) dp[i][0]=true;
        if(nums[0]<=sum) dp[0][nums[0]]=true;
        for(int idx=1;idx<n;idx++){
            for(int target=1;target<=sum;target++){
                boolean nottake = dp[idx-1][target];
                boolean take=false;
                if(nums[idx]<=target) take=dp[idx-1][target-nums[idx]];
                dp[idx][target]=nottake||take;
            }
        }
        return dp[n-1][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%2==1) return false;
        int target=sum/2;
        boolean dp[][] = new boolean[nums.length][target+1];
        return check(nums.length,target,nums,dp);
    }
}