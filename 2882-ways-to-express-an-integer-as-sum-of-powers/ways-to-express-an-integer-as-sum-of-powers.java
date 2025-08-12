class Solution {
    long MOD=1000000007;
    public long check(int n,int x,int maxval,long dp[][]){
        if(n==0) return 1;
        if(n<0 || maxval==0) return 0;
        if(dp[n][maxval]!=-1) return dp[n][maxval];
        int rem = (int)Math.pow(maxval,x);
        long take=0;
        if((n-rem)>=0){
            take=check(n-rem,x,maxval-1,dp);
        }
        long donttake=check(n,x,maxval-1,dp);
        return dp[n][maxval]=(take+donttake)%MOD;
    }
    public int numberOfWays(int n, int x) {
        int maxval = (int)(Math.pow(n,1.0/x))+1;
        long dp[][] = new long[n+1][maxval+1];
        for(int i=0;i<=n;i++) for(int j=0;j<=maxval;j++) dp[i][j]=-1;
        return (int)check(n,x,maxval,dp);
    }
}