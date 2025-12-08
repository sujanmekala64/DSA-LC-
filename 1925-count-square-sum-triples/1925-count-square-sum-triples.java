class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=n;i>0;i--){
            int r=i-1;
            int l=1;
            while(l<r){
                int val = (l*l+r*r);
                if(val==i*i){
                    ans+=2;
                    l++;
                    r--;
                }
                else if(val>i*i) r--;
                else l++;
            }
        }
        return ans;
    }
}