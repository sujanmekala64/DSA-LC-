class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int low=0;
        int high=c-1;
        while(low<r && high>=0){
            if(matrix[low][high]==target) return true;
            else if(matrix[low][high]>target) high--;
            else low++;
        }
        return false;
    }
}