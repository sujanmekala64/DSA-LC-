class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int maxidx=0;
        for(int i=0;i<nums.length;i++){
            if(maxidx==nums.length-1) return true; 
            if(nums[i]==0 && maxidx==i) return false;
            maxidx=Math.max(maxidx,nums[i]+i);
        }
        return true;
    }
}