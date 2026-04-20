class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(r>0){
            if(colors[0]!=colors[r]){
                ans=r;
                break;
            }
            r--;
        }
        while(l<n-1){
            if(colors[l]!=colors[n-1]){
                return Math.max(ans,n-l-1);
            }
            l++;
        }
        return -1;
    }
}