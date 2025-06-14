class Solution {
    public void dfs(int i,int j,int row,int col,char grid[][],boolean vis[][]){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]=='0' || vis[i][j]==true) return ;
        if(!vis[i][j]){
            vis[i][j]=true;
            dfs(i-1,j,row,col,grid,vis); //up
            dfs(i+1,j,row,col,grid,vis); //down
            dfs(i,j-1,row,col,grid,vis); //left
            dfs(i,j+1,row,col,grid,vis); //right
        }
    }
    public int numIslands(char[][] grid) {
        int cnt=0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    cnt++;
                    dfs(i,j,grid.length,grid[0].length,grid,vis);
                }
            }
        }
        return cnt;
    }
}