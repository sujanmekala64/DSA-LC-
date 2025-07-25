class Solution {
    public int maxSum(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                HashSet<Integer> set = new HashSet<>();
                int sum=0;
                for(int k=i;k<=j;k++){
                    if(!set.contains(nums[k])){
                        if(k!=i && nums[k]<0) continue;
                        set.add(nums[k]);
                        sum+=nums[k];
                        maxi=Math.max(maxi,sum);
                    }
                }
            }
        }
        return maxi;
    }
}