class Solution {
    public int countNegatives(int[][] grid) {
        int r=0;
        int c=grid[0].length-1;
        int ans=0;
        while(r<grid.length && c>=0){
            if(grid[r][c]<0){
                ans+=grid.length-r;
                c--;
            }
            else{
                r++;
            }
        }
        return ans;
    }
}