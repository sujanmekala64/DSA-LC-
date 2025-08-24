class Solution {
    public int longestSubarray(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                r=i;
                break;
            }
        }
        int cnt=r;
        int ans=r;
        int l=r+1;
        while(l<nums.length){
            if(nums[l]==0){
                cnt=(l-r-1);
                r=l;
            }
            else cnt++;
            l++;
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}