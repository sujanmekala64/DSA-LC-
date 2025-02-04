class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> f = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int j=0,k=0;
        while(j<r && k<c){
            for(int i=k;i<c;i++){
                f.add(matrix[j][i]);
            }
            j++;
            for(int i=j;i<r;i++){
                f.add(matrix[i][c-1]);
            }
            c--;
            if(j<r){
                for(int i=c-1;i>=k;i--){
                    f.add(matrix[r-1][i]);
                }
                r--;
            }
            if(k<c){
                for(int i=r-1;i>=j;i--){
                    f.add(matrix[i][k]);
                }
                k++;
            }
        }
        return f;
    }
}