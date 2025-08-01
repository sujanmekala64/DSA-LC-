class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int rows[] = {0,0,1,1};
        int cols[] = {0,1,0,1};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int w=0;
                int b=0;
                for(int k=0;k<4;k++){
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