class Solution {
    public int check(int m,int n,int arr[][],int dp[][]){
        if(arr[0][0]==0) dp[0][0]=1;
        else dp[0][0]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) continue;
                if(i==0 && j==0) continue;
                int up=0;
                int le=0;
                if(i>0) up=dp[i-1][j];
                if(j>0) le=dp[i][j-1];
                dp[i][j]=up+le;
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        return check(m,n,obstacleGrid,dp);
    }
}