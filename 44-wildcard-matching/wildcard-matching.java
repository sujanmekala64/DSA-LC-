class Solution {
    public boolean check(String s,String p,int n1,int n2,boolean dp[][]){
        dp[0][0]=true;
        for(int i=1;i<=n1;i++) dp[i][0]=false;
        for(int i=1;i<=n2;i++){
            boolean flag=true;
            for(int j=1;j<=i;j++){
                if(p.charAt(j-1)!='*'){
                    flag=false;
                    break;
                }
            } 
            dp[0][i]=flag;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s.charAt(i-1)==p.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='?') dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*') dp[i][j]=dp[i-1][j]||dp[i][j-1]||dp[i-1][j-1];
                else dp[i][j]=false;
            }
        }
        return dp[n1][n2];
        // if(n1<0 && n2<0) return true;
        // if(n2<0 && n1>=0) return false;
        // if(n1<0 && n2>=0){
        //     for(int i=0;i<=n2;i++){
        //         if(p.charAt(i)!='*') return false;
        //     }
        //     return true;
        // }
        // if(s.charAt(n1)==p.charAt(n2)){
        //    return check(s,p,n1-1,n2-1,dp);
        // }
        // if(p.charAt(n2)=='?') return check(s,p,n1-1,n2-1,dp);
        // if(p.charAt(n2)=='*') return check(s,p,n1,n2-1,dp)||check(s,p,n1-1,n2,dp);
        // else return false;
    }
    public boolean isMatch(String s, String p) {
        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        // for(int i=0;i<s.length();i++) for(int j=0;j<p.length();j++) dp[i][j]=-1;
        return check(s,p,s.length(),p.length(),dp);
    }
}