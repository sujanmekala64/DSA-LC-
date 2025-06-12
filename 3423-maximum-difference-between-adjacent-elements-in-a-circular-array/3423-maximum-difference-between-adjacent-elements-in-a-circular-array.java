class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            int val=Math.abs(nums[i]-nums[i-1]);
            if(val>maxi) maxi=val;
        }
        int end=Math.abs(nums[0]-nums[nums.length-1]);
        return end>maxi?end:maxi;
    }
}