class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length,sum = n*(n+1)/2,tot=0;
        // for(int i=0;i<n;i++) tot += nums[i];
        // return sum-tot;

        //cycle sort
        int temp=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]<nums.length && nums[i]!=i){
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        for(int i=0;i<nums.length;i++) if(nums[i]!=i) return i;
        return nums.length;
    }
}