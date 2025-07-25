class Solution {
    public int maxSum(int[] nums) {
        int sum=nums[0];
        int maxi=nums[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int num:nums){
            if(!set.contains(num)){
                if(sum<=0 && num>0){
                    sum=num;
                }
                else if(num>0){
                    sum+=num;
                }
                maxi=Math.max(maxi,Math.max(num,sum));
                set.add(num);
            }
        }
        return maxi;
    }
}