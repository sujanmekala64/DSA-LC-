class Solution {
    public int longestSubarray(int[] nums) {
        int cnt=2;
        int ans=2;
        int prev=nums[0]+nums[1];
        for(int i=2;i<nums.length;i++){
            if(prev==nums[i]){
                cnt++;
                ans=Math.max(cnt,ans);
            }
            else cnt=2;
            prev=nums[i]+nums[i-1];
        }
        return ans;
    }
}