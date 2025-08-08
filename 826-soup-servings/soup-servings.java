class Solution {
    public double checkProb(int A,int B,double dp[][]){
        if(A<=0 && B>0) return 1;
        else if(A<=0 && B<=0) return 0.5;
        else if(A>0 && B<=0) return 0;
        if(dp[A][B]!=-1) return dp[A][B];
        return dp[A][B]=0.25*(checkProb(A-100,B,dp)+checkProb(A-75,B-25,dp)+checkProb(A-50,B-50,dp)+checkProb(A-25,B-75,dp));
    }
    public double soupServings(int n) {
        if(n>=4800) return 1;
        double dp[][] = new double[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        double ans = checkProb(n,n,dp);
        return (ans);
    }
}