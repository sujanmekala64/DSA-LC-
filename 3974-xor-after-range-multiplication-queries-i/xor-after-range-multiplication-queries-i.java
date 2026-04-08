class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1_000_000_007;
        int l=0,r=0,k=0,v=0;
        for(int quer[]:queries){
            l=quer[0];
            r=quer[1];
            k=quer[2];
            v=quer[3];
            while(l<=r){
                long val=nums[l];
                nums[l]=(int)((val*v)%MOD);
                l+=k;
            }
        }
        int ans=0;
        for(int num:nums) ans^=num;
        return ans;
    }
}