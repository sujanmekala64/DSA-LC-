class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int l=0;
        int prev=0;
        int cnt=0;
        int n=colors.length;
        int limit=n+k-1;
        while(l<colors.length){
            int r=l+1;
            while(r<limit && colors[(r-1)%n]!=colors[r%n]){
                r++;
            }
            if((r-l)>=k) cnt+=(r-l-k+1);
            l=r;
        }
        return cnt;
    }
}