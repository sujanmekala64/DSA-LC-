class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int eveidx=0;
        int oddidx=1;
        for(int num:nums){
            if(num>0){
                ans[eveidx]=num;
                eveidx+=2;
            }
            else{
                ans[oddidx]=num;
                oddidx+=2;
            }
        }
        return ans;
    }
}