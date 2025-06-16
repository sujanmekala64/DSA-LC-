class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int mini=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<mini) mini=nums[i];
            else if((nums[i]-mini)>ans) ans=nums[i]-mini;
        }
        return ans;
    }
}