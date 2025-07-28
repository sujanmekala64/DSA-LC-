class Solution {
    // public int findMaxor(int nums[],int idx,int val){
    //     if(idx==nums.length){
    //         return val;
    //     }
    //     int notinc = findMaxXor(nums,idx+1,val);
    //     int inc = findMaxXor(nums,idx+1,val|nums[idx]);
    //     return Math.max(notinc,inc);
    // }
    public int findCount(int nums[],int idx,int val,int req,int dp[][]){
        if(val>req) return 0;
        if(idx==nums.length){
            if(val==req) return 1;
            return 0;
        }
        if(dp[idx][val]!=-1) return dp[idx][val];
        int notinc = findCount(nums,idx+1,val,req,dp);
        int inc = findCount(nums,idx+1,val|nums[idx],req,dp);
        return dp[idx][val]=notinc+inc;
    }
    public int countMaxOrSubsets(int[] nums) {
        // int maxxor=findMaxXor(nums,0,0);
        int maxor=0;
        for(int num:nums) maxor|=num;
        int dp[][] = new int[nums.length+1][maxor+1];
        for(int i=0;i<=nums.length;i++) for(int j=0;j<=maxor;j++) dp[i][j]=-1;
        return findCount(nums,0,0,maxor,dp);
    }
}