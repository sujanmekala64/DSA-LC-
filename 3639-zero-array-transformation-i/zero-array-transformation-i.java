class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int diff[] = new int[n+1];
        for(int query[]:queries){
            diff[query[0]]+=1;
            diff[query[1]+1]-=1;
        }
        for(int i=1;i<n;i++){
            diff[i]=diff[i-1]+diff[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>diff[i]) return false;
        }
        return true;
    }
}