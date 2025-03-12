class Solution {
    public int lower_bound(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>=target) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    public int maximumCount(int[] nums) {
        int neg = lower_bound(nums,0);
        int pos = nums.length-lower_bound(nums,1);
        return Math.max(neg,pos);
    }
}