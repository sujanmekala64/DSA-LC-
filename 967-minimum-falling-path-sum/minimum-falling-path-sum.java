class Solution {
    public int check(int m,int n,int arr[][],int dp[][]){
        for(int i=0;i<n;i++) dp[0][i]=arr[0][i];
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int uple=Integer.MAX_VALUE;
                int up=Integer.MAX_VALUE;
                int upri=Integer.MAX_VALUE;
                if(i>0 && j>0) uple=arr[i][j]+dp[i-1][j-1];
                if(i>0) up=arr[i][j]+dp[i-1][j];
                if(i>0 && j<n-1) upri=arr[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(uple,Math.min(up,upri));
            }
        }
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) maxi=Math.min(maxi,dp[m-1][i]);
        return maxi;
    }
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][] = new int[m][n];
        return check(m,n,matrix,dp);
    }
}