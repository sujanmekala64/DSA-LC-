class Solution {
    public void check(int matrix[][],int dp[][],int i,int j,int n,int m){
        for(int p=0;p<m;p++) matrix[i][p]=0;
        for(int q=0;q<n;q++) matrix[q][j]=0;
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length; 
        int arr[][] = new int[n][m];
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) dp[i][j]=-1;
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) arr[i][j]=matrix[i][j];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) if(arr[i][j]==0) check(matrix,dp,i,j,n,m);
    }
}