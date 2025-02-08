class Solution {
    public int rob(int[] nums) {
       int incl=0;
        int excl=0;
        for(int i=0;i<nums.length;i++){
            int f = incl;
            int s = excl;
            incl = s+nums[i];
            excl = Math.max(f,s);
        }
        return Math.max(incl,excl);
    }
}