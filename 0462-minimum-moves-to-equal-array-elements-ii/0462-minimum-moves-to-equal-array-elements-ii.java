class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int ans=0;
        for(int val:nums){
            if(val==median) continue;
            ans+=Math.abs(val-median); 
        }
        return ans;
    }
}