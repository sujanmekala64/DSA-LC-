class Solution {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int arr[][] = new int[r][c];
        int max=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0) arr[i][j] = matrix[i][j]-'0';
                else{
                    if(matrix[i][j]-'0'==0) arr[i][j]=0;
                    else{
                        arr[i][j]=1+Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]));
                    } 
                }
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        return max*max;
    }
}