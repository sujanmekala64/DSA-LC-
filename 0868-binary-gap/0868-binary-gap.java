class Solution {
    public int binaryGap(int n) {
        int prev=-1;
        int cnt=1;
        int mod=0;
        int ans=0;
        while(n>0){
            mod=n%2;
            if(mod==1){
                if(prev==-1) prev=cnt;
                else{
                    ans=Math.max(ans,cnt-prev);
                    prev=cnt;
                }
            }
            cnt++;
            n/=2;
        }
        return ans;
    }
}