class Solution {
    int ans=0;
    public void check(int nums[],int idx,int xor){
        if(idx==nums.length){
            ans+=xor;
            return ;
        }
        check(nums,idx+1,xor^nums[idx]);
        check(nums,idx+1,xor);
        return ;
    }
    public int subsetXORSum(int[] nums) {
        check(nums,0,0);
        return ans;
    }
}