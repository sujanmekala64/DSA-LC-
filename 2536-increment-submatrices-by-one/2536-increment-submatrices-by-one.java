class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int diff[][] = new int[n][n];
        for(int i=0;i<queries.length;i++){
            int r1=queries[i][0];
            int c1=queries[i][1];
            int r2=queries[i][2];
            int c2=queries[i][3];
            for(int j=r1;j<=r2;j++){
                diff[j][c1]+=1;
                if(c2+1<n) diff[j][c2+1]-=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                diff[i][j]=diff[i][j]+diff[i][j-1];
            }
        }
        return diff;
    }
}