class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length*grid.length;
        long realsum = (n*(n+1))/2;
        long realsquare = (n*(n+1)*(2*n+1))/6;
        long calcsum=0;
        long calcsquare=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                calcsum+=grid[i][j];
                calcsquare+=grid[i][j]*grid[i][j];
            }
        }
        long minus = (calcsum-realsum);
        long squareminus = (calcsquare-realsquare);
        long plus = (squareminus)/(minus);
        long repeated = (plus+minus)/2;
        long missing = (plus-minus)/2;
        return new int[]{(int)repeated,(int)missing};
    }
}