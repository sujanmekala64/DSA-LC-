class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        if(nums.length==1) return 1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1] || nums[i]!=nums[i+1]){
                nums[c]=nums[i];
                c++;
            }
        }
        nums[c++]=nums[nums.length-1];
        return c;
    }
}