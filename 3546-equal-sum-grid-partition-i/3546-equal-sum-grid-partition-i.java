class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                total+=grid[i][j];
            }
        }
        long r=0,c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                r+=grid[i][j];
            }
            if(r==total-r) return true;
        }
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                c+=grid[j][i];
            }
            if(c==total-c) return true;
        }
        return false;
    }
}