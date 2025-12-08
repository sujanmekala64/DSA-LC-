class Solution {
    public int countTriples(int n) {
        int ans=0,r,l,val;
        for(int i=n;i>0;i--){
            r=i-1;
            l=1;
            while(l<r){
                val = (l*l+r*r);
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