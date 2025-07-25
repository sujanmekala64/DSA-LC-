class Solution {
    public int maxSum(int[] nums) {
        int sum=nums[0];
        int maxi=nums[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(!set.contains(nums[i]) && nums[i]>0){
                if(sum<0) sum=nums[i];
                else sum+=nums[i];
                set.add(nums[i]);
            }
            maxi=Math.max(maxi,Math.max(nums[i],sum));
        }
        return maxi;
    }
}