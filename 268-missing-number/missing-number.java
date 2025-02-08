class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,sum = n*(n+1)/2,tot=0;
        for(int i=0;i<n;i++) tot += nums[i];
        return sum-tot;
    }
}