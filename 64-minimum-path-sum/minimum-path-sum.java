class Solution {
    public int check(int m,int n,int grid[][],int dp[][]){
        dp[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int ri=Integer.MAX_VALUE;
                int dos=Integer.MAX_VALUE;
                if(i>0) dos=grid[i][j]+dp[i-1][j];
                if(j>0) ri=grid[i][j]+dp[i][j-1];
                dp[i][j]=Math.min(dos,ri);
            }
        }
        return dp[m-1][n-1];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
       return check(m,n,grid,dp);
    }
}