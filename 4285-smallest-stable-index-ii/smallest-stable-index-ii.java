class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mini[]=new int[nums.length];
        int m=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            m=Math.min(m,nums[i]);
            mini[i]=m;
        }
        int maxi=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<nums.length;i++) System.out.println(mini[i]);
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            if((maxi-mini[i])<=k){
                return i;
            }
        }
        return ans;
    }
}