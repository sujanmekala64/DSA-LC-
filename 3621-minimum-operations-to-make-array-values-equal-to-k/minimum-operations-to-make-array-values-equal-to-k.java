class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k && !set.contains(nums[i])){
                ans++;
                set.add(nums[i]);
            }
            else if(nums[i]<k) return -1;
        }
        return ans;
    }
}