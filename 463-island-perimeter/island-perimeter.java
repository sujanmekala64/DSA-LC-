class Solution {
    int c=0;
    public void countPerimeter(int grid[][],int i,int j){
        int up=1;
        int down=1;
        int left=1;
        int right=1;
        if(i-1<0){
            c++;
            up=0;
        }
        if(i+1==grid.length){
            c++;
            down=0;
        } 
        if(j-1<0){
            c++;
            left=0;
        }
        if(j+1==grid[0].length){
            c++;
            right=0;
        } 
        if(up==1 && grid[i-1][j]==0) c++;
        if(down==1 && grid[i+1][j]==0) c++;
        if(left==1 && grid[i][j-1]==0) c++;
        if(right==1 && grid[i][j+1]==0) c++;
    }
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    countPerimeter(grid,i,j);
                }
            }
        }
        return c;
    }
}