class Solution {
    int ans=0;
    public void check(int nums[],int idx,int target,int tot){
        if(idx==nums.length){
            if(target==tot) ans++;
            return ;
        }
        check(nums,idx+1,target,tot+nums[idx]);
        check(nums,idx+1,target,tot-nums[idx]);
        return ;
    }
    public int findTargetSumWays(int[] nums, int target) {
        check(nums,0,target,0);
        return ans;
    }
}