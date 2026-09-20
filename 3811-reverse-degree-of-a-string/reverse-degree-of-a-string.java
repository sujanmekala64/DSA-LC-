class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int idx=1;
        int z=0;
        for(char p:s.toCharArray()){
            z=(26-(p-'a'));
            ans+=(z*idx);
            idx++;
        }
        return ans;
    }
}