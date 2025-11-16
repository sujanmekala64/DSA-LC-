class Solution {
    public int numSub(String s) {
        int l=0;
        int r=0;
        long ans=0;
        int mod=1_000_000_007;
        while(l<s.length()){
            while(r<s.length() && s.charAt(r)=='1'){
                r++;
            }
            // if(c)
            if(l!=r){
                int val = (r-l);
                // int add = ((val)*(val+1))/2%mod;
                ans=(ans+(long)(val)*(val+1)/2)%mod;
                l=r;
            }
            l++;
            r++;
        }
        return (int)ans;
    }
}