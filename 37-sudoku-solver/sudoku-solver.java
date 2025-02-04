class Solution {
    public boolean isSafe(char board[][],int row,int col,int number){
        char numb = (char)(number+'0');
        //horizontal && vertical
        for(int i=0;i<board.length;i++){
            if(board[row][i]==numb) return false;
            if(board[i][col]==numb) return false;
        }
        //check grids
        int nrow=(row/3)*3;
        int ncol=(col/3)*3;
        for(int i=nrow;i<nrow+3;i++){
            for(int j=ncol;j<ncol+3;j++){
                if(board[i][j]==numb) return false;
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row==board.length) return true;
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
            if(helper(board,nrow,ncol))  return true;
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(helper(board,nrow,ncol)) return true;
                    else board[row][col]='.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}