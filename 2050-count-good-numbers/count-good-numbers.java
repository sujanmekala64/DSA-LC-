class Solution {
    public long binaryExpo(long base,long exp,int mod){
        long res=1;
        while(exp>0){
            if(exp%2==1) res=(res*base)%mod;
            base=(base*base)%mod;
            exp=exp/2;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        int mod = 1000000007;
        long oddpos = binaryExpo(4,(n/2),mod);
        long evenpos = binaryExpo(5,(n-(n/2)),mod);
        return (int)((oddpos*evenpos)%mod);
    }
}