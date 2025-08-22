class Solution {
    public int minimumArea(int[][] grid) {
        int minrow=1000;
        int maxrow=-1;
        int mincol=1000;
        int maxcol=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(i<minrow) minrow=i;
                    if(i>maxrow) maxrow=i;
                    if(j<mincol) mincol=j;
                    if(j>maxcol) maxcol=j;
                }
            }
        }
        int r = (maxrow+1)-minrow;
        int c = (maxcol+1)-mincol;
        return (r*c);
    }
}