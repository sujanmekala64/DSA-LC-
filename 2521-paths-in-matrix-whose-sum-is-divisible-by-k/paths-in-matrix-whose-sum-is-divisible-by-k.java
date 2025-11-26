class Solution {
    private int MOD = 1_000_000_007;
    public int check(int grid[][],int i,int j,int k,int total,int[][][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            total+=grid[i][j];
            if(total%k==0){
                return 1;
            } 
            else return 0;
        }
        if(dp[i][j][total%k]!=-1) return dp[i][j][total%k];
        int dos=0;
        int ri=0;
        if(i<grid.length-1){
            dos=check(grid,i+1,j,k,total+grid[i][j],dp)% MOD;
        } 
        if(j<grid[0].length-1){
            ri=check(grid,i,j+1,k,total+grid[i][j],dp)% MOD;
        } 
        return dp[i][j][total%k]=(dos+ri)%MOD;
    }
    public int numberOfPaths(int[][] grid, int k) {
        int dp[][][] = new int[grid.length+1][grid[0].length+1][k+1];
        for(int i=0;i<=grid.length;i++) for(int j=0;j<=grid[0].length;j++) for(int f=0;f<=k;f++) dp[i][j][f]=-1;
        return check(grid,0,0,k,0,dp);
    }
}