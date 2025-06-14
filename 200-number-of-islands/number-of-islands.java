class Solution {
    public void dfs(int i,int j,int r,int c,char[][] grid){
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]=='0') return ;
        grid[i][j]='0';
        dfs(i+1,j,r,c,grid);
        dfs(i-1,j,r,c,grid);
        dfs(i,j-1,r,c,grid);
        dfs(i,j+1,r,c,grid);
        return ;
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid.length,grid[0].length,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
}