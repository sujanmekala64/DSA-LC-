class Solution {
    public int longestSubarray(int[] nums) {
        int ans=1;
        int cnt=1;
        int maxi=0;
        for(int num:nums) if(num>maxi) maxi=num;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev==maxi && nums[i]==maxi) cnt++;
            else cnt=1;
            prev=nums[i];
            ans=Math.max(cnt,ans);
        }
        return ans;
    }
}