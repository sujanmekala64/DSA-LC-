class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int val[] = new int[nums.length];
        for(int num:nums) val[num]++;
        int idx=0;
        for(int i=0;i<nums.length;i++) if(val[i]==2) ans[idx++]=i;
        return ans;
    }
}