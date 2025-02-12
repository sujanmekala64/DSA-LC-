class Solution {
    int c=1;
    public boolean check(int grid[][],int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return false;
        grid[i][j]=0;
        if(check(grid,i-1,j)) c++;
        if(check(grid,i+1,j)) c++;
        if(check(grid,i,j-1)) c++;
        if(check(grid,i,j+1)) c++;
        return true;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxi=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    check(grid,i,j);
                    if(c>maxi){
                        maxi=c;
                        c=1;
                    }
                    else c=1; 
                }
            }
        }
        return maxi;
    }
}