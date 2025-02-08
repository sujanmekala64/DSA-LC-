class Solution {
    public int check(String s,String t,int n,int m,String newstr,int dp[][]){
        for(int i=0;i<=n;i++) dp[i][0]=1;
        for(int i=1;i<=m;i++) dp[0][i]=0; //chcek back at dp[i][0] so that means when j is 0 it is 1 not 0 or u can omit this loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][m];
    //    if(m<0) return 1;
    //    if(n<0) return 0;
    //    if(dp[n][m]!=-1) return dp[n][m];
    //    if(s.charAt(n)==t.charAt(m)){
    //     return dp[n][m]=check(s,t,n-1,m-1,newstr,dp)+check(s,t,n-1,m,newstr,dp);
    //    }
    //    return dp[n][m]=check(s,t,n-1,m,newstr,dp);
    }
    public int numDistinct(String s, String t){
        int dp[][] = new int[s.length()+1][t.length()+1];
        // for(int i=0;i<s.length();i++) for(int j=0;j<t.length();j++) dp[i][j]=-1;
        return check(s,t,s.length(),t.length(),"",dp);
    }
}