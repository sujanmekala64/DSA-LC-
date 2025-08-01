class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length-1;j++){
                int rows[] = {0,0,1,1};
                int cols[] = {0,1,0,1};
                int w=0;
                int b=0;
                for(int k=0;k<4;k++){
                    if(i+rows[k]>=grid.length || j+cols[k]>=grid[0].length) continue;
                    int row=i+rows[k];
                    int col=j+cols[k];
                    if(grid[row][col]=='W') w++;
                    else b++;
                }
                if(w>=3 || b>=3) return true;
            }
        }
        return false;
    }
}