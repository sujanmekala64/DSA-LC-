class Solution {
    public boolean isTrionic(int[] nums) {
        int inc1 = 0;
        int dec1 = 0;
        int inc2 = 0;
        // if(nums.)
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i] && dec1==0){
                inc1=1;
            }
            else if(nums[i-1]>nums[i] && inc1!=0 && inc2!=1){
                dec1=1;
            }
            else if(nums[i-1]<nums[i]){
                inc2=1;
            }
            else return false;
        }
        return inc1==1 && dec1==1 && inc2==1;
    }
}