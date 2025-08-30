class Solution {
    boolean ans=true;
    public boolean isSafe(char board[][],int row,int col,int number){
        //horizontal
        for(int i=0;i<board.length;i++){
            if(i!=col && board[row][i]==number) return false;
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(i!=row && board[i][col]==number) return false;
        }
        //grid check
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(i!=row && j!=col && board[i][j]==number) return false;
            }
        }
        return true;
    }
    public void helper(char board[][],int row,int col){
        if(row==board.length){
            return ;
        }
        int nrow=0;
        int ncol=0;
        if(col!=board.length-1){
            nrow=row;
            ncol=col+1;
        }
        else{
            nrow=row+1;
            ncol=0;
        }
        if(board[row][col]!='.'){
            if(isSafe(board,row,col,board[row][col])){
                helper(board,nrow,ncol);
            }
            else ans=false;
        }else helper(board,nrow,ncol);
    }
    public boolean isValidSudoku(char[][] board) {
        helper(board,0,0);
        return ans;
    }
}