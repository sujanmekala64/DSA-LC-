class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(r>0){
            if(colors[l]!=colors[r]){
                ans=r;
                break;
            }
            r--;
        }
        r=n-1;
        System.out.println(ans);
        while(l<n-1){
            if(colors[l]!=colors[r]){
                System.out.println(l);
                return Math.max(ans,n-l-1);
            }
            l++;
        }
        return -1;
    }
}