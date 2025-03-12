class Solution {
    public int count(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int result=nums.length;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<target) left=mid+1;
            else{
                result=mid;
                right=mid-1;
            }
        }
        return result;
    }
    public int maximumCount(int[] nums) {
        int neg = count(nums,0);
        int pos = nums.length-count(nums,1);
        return Math.max(neg,pos);
    }
}