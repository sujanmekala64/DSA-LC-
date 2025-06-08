class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length;i++){
            int cnt=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]) cnt++;
                else cnt=0;
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}