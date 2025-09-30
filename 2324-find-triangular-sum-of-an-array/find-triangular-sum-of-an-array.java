class Solution {
    public int triangularSum(int[] nums) {
        int idx=nums.length-1;
        while(idx!=0){
            for(int i=0;i<idx;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            idx--;
        }
        return nums[0];
    }
}