class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=1;
        int right=nums.length-2;
        int maxi=nums[0]+nums[nums.length-1];
        int sum=0;
        while(left<right){
            sum=nums[left]+nums[right];
            if(sum>maxi) maxi=sum;
            left++;
            right--;
        }
        return maxi;
    }
}