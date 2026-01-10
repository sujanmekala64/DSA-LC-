class Solution {
    public int maxLCS(int m,int n,String s1,String s2,int dp[][]){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=s1.charAt(i-1)+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        int MaxLCSAscii = maxLCS(m,n,s1,s2,dp);
        int ans=0;
        int c1=0;
        int c2=0;
        for(char p:s1.toCharArray()) c1+=p;
        for(char p:s2.toCharArray()) c2+=p;
        return (c1+c2)-(2*MaxLCSAscii);
    }
}