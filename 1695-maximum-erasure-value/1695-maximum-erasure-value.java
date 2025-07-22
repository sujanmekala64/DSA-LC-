class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int maxi=0;
        HashSet<Integer> set = new HashSet<>();
        while(right<nums.length){
            while(left<nums.length && set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            maxi=Math.max(maxi,sum);
            right++;
        }
        return maxi;
    }
}