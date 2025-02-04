class Solution {
    public int check(String word1,String word2,int n1,int n2,int dp[][]){
        for(int i=0;i<=n1;i++) dp[i][0]=i;
        for(int i=1;i<=n2;i++) dp[0][i]=i;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[n1][n2];
        // if(n1<0) return n2+1;
        // if(n2<0) return n1+1;
        // if(dp[n1][n2]!=-1) return dp[n1][n2];
        // if(word1.charAt(n1)==word2.charAt(n2)){
        //     return dp[n1][n2]=check(word1,word2,n1-1,n2-1,dp);
        // }
        // else{
        //     return dp[n1][n2]=1+Math.min(check(word1,word2,n1-1,n2,dp),Math.min(check(word1,word2,n1,n2-1,dp),check(word1,word2,n1-1,n2-1,dp)));
        // }
    }
    public int minDistance(String word1, String word2) {
        if(word1.length()==0) return word2.length();
        if(word2.length()==0) return word1.length();
        if(word1.equals(word2)) return 0;
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        // for(int i=0;i<=word1.length();i++) for(int j=0;j<=word2.length();j++) dp[i][j]=-1;
        return check(word1,word2,word1.length(),word2.length(),dp);
    }
}