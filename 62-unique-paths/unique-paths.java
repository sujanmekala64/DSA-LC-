class Solution {
    public int check(int m,int n,int dp[][]){
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int le=0;
                int ri=0;
                if(i>0) le=dp[i-1][j];
                if(j>0) ri=dp[i][j-1];
                dp[i][j]=le+ri;
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
       return check(m,n,dp);
    }    
}