class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        k=k%c;
        for(int i=0;i<r;i+=2){ //even idx rows
            for(int j=0;j<c;j++){
                if(mat[i][j]!=mat[i][(c+j-k)%c]) return false;
            }
        }
        for(int i=1;i<r;i+=2){
            for(int j=0;j<c;j++){
                if(mat[i][j]!=mat[i][(c+j+k)%c]) return false;
            }
        }
        return true;
    }
}