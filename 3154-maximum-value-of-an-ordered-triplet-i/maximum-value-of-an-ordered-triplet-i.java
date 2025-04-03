class Solution {
    public long maximumTripletValue(int[] nums) {
        int leftmax[] = new int[nums.length];
        int rightmax[] = new int[nums.length];
        leftmax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            leftmax[i]=Math.max(nums[i],leftmax[i-1]);
        }
        rightmax[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            rightmax[j]=Math.max(nums[j],rightmax[j+1]);
        }
        long ans=0;
        for(int i=1;i<nums.length-1;i++){
            long val=(long)(leftmax[i-1]-nums[i])*rightmax[i+1];
            ans=Math.max(ans,val);
        }
        return ans;
    }
}