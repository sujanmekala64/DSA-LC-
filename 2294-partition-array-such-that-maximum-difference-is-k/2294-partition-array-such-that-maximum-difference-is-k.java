class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[0];
        int cnt=0;
        for(int num:nums){
            if(num-min>k){
                min=num;
                cnt++;
            }
        }
        return cnt+1;
    }
}