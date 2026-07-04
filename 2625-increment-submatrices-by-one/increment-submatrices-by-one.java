class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int diff[][] = new int[n+1][n+1];
        for(int query[]:queries){
            int r1=query[0];
            int c1=query[1];
            int r2=query[2];
            int c2=query[3];
            for(int i=r1;i<=r2;i++){
                diff[i][c1]++;
                diff[i][c2+1]--;
            }
        }
        int ans[][] = new int[n][n];
        for(int i=0;i<n;i++){
            ans[i][0]=diff[i][0];
            for(int j=1;j<n;j++){
                ans[i][j]=diff[i][j-1]+diff[i][j];
                diff[i][j]=ans[i][j];
            }
        }
        return ans;
    }
}