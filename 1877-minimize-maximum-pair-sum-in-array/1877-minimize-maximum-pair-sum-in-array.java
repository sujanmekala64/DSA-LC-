class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int maxi=-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            maxi=Math.max(maxi,sum);
            left++;
            right--;
        }
        return maxi;
    }
}