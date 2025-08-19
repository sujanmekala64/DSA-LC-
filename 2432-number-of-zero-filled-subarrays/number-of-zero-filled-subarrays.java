class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int cnt=1;
        for(int num:nums){
            if(num==0){
                ans+=cnt;
                cnt++;
            }
            else cnt=1;
        }
        return ans;
    }
}