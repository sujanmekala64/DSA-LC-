class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int zerocount=0;
        for(int i=0;i<nums.length;i++) if(nums[i]==0) zerocount++;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx]=nums[i];
                idx++;
            }
        }
        for(int i=nums.length-zerocount;i<nums.length;i++) nums[i]=0;
        return nums;
    }
}