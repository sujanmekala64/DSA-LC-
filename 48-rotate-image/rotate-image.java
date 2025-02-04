class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int arr[][] = new int[r][c];
        int f=0;
        for(int i=0;i<r;i++){
            int g=0;
            for(int j=c-1;j>=0;j--){
                arr[f][g] = matrix[j][i];
                g++;
            }
            f++;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}