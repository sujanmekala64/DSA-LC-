class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long rowsum[] = new long[grid.length];
        long colsum[] = new long[grid[0].length];
        long r=0;
        long totrow=0;
        long totcol=0;
        long c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                r+=grid[i][j];
                totrow+=grid[i][j];
            }
            rowsum[i]=r;
        }
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                c+=grid[j][i];
                totcol+=grid[j][i];
            }
            colsum[i]=c;
        }
        //for horizontal cut
        for(int i=0;i<rowsum.length;i++){
            System.out.println("r"+" "+rowsum[i]+" "+totrow);
            if(rowsum[i]==totrow-rowsum[i]) return true;
            // totrow-=rowsum[i];
        }
        //for vertical cut
        for(int i=0;i<colsum.length;i++){
            System.out.println("c"+" "+colsum[i]+" "+totcol);
            if(colsum[i]==totcol-colsum[i]) return true;
        }
        return false;
    }
}