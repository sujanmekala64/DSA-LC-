class Solution {
    public int maxOperations(int[] nums) {
        int prev=nums[0]+nums[1];
        int ans=1;
        for(int i=2;i<nums.length-1;i+=2){
            if(prev!=nums[i]+nums[i+1]) return ans;
            prev=nums[i]+nums[i+1];
            ans++;
        }
        return ans;
    }
}