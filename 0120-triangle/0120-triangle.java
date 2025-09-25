class Solution {
    public int check(int a,int b,int m,List<List<Integer>> triangle,int dp[][]){
        // dp[0][0]=triangle.get(0).get(0);
        // for(int i=1;i<m;i++){
        //     for(int j=0;j<=i;j++){
        //         int down=Integer.MAX_VALUE;
        //         int diag=Integer.MAX_VALUE;
        //         if(i>0) down=triangle.get(i).get(j)+dp[i-1][j];
        //         if(i>0 && j>0) diag=triangle.get(i).get(j)+dp[i-1][j-1];
        //         dp[i][j]=Math.min(down,diag);
        //     }
        // }
        if(a>=m || b>=m) return 0;
        int down = Integer.MAX_VALUE;
        int diag = Integer.MAX_VALUE;
        if(dp[a][b]!=-1) return dp[a][b];
        down = triangle.get(a).get(b)+check(a+1,b,m,triangle,dp);
        diag = triangle.get(a).get(b)+check(a+1,b+1,m,triangle,dp);
        return dp[a][b]=Math.min(down,diag);
        // int maxi=Integer.MAX_VALUE;
        // for(int i=0;i<m;i++){
        //     maxi=Math.min(maxi,dp[m-1][i]);
        // }
        // return maxi;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int dp[][] = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++) dp[i][j]=-1;
        }
        return check(0,0,m,triangle,dp);
    }
}