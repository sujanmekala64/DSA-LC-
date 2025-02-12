class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gidx=0;
        int sidx=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        while(gidx<g.length && sidx<s.length){
            if(g[gidx]<=s[sidx]){
                cnt++;
                gidx++;
                sidx++;
            }
            else{
                sidx++;
            }
        }
        return cnt;
    }
}