class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int tr=x;
        int br=x+k-1;
        int c=y;
        int temp=0;
        while(tr<br){
            c=y;
            while(c<(y+k)){
                temp=grid[tr][c];
                grid[tr][c]=grid[br][c];
                grid[br][c]=temp;
                c++;
            }
            tr++;
            br--;
        }
        return grid;
    }
}