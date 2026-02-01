class Solution {
    public int minimumCost(int[] nums) {
        int ans = nums[0];
        int onemin=Math.min(nums[1],nums[2]);
        int twomin=Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            if(nums[i]<=onemin || nums[i]<=twomin){
                if(onemin>twomin){
                    onemin=twomin;
                    twomin=nums[i];
                }
                else{
                    twomin=onemin;
                    onemin=nums[i];
                }
            }
        }
        ans+=(onemin+twomin);
        return ans;
    }
}