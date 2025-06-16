class Solution {
    public int maximumDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]-min>max) max=nums[i]-min;
        }
        return max==0?-1:max;
    }
}